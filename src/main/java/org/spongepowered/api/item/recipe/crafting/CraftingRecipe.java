/*
 * This file is part of SpongeAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered <https://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.spongepowered.api.item.recipe.crafting;

import org.spongepowered.api.item.ItemTypes;
import org.spongepowered.api.item.inventory.ItemStack;
import org.spongepowered.api.item.inventory.type.GridInventory;
import org.spongepowered.api.item.recipe.Recipe;
import org.spongepowered.api.world.World;

import java.util.List;
import java.util.Optional;

/**
 * A CraftingRecipe represents some craftable recipe in the game.
 *
 * <p>It is essentially a Predicate that checks for if a recipe is valid as well
 * as a function from a crafting matrix to a list of {@link ItemStack} (the
 * crafting result), therefore making it an immutable interface.</p>
 *
 * <p>The passed in ItemGrid is usually a crafting inventory, e.g. a 2x2 or 3x3
 * crafting matrix.</p>
 *
 * <p>The requirements of a CraftingRecipe can be general, they just have to
 * eventually return a boolean given an itemgrid.</p>
 */
public interface CraftingRecipe extends Recipe {

    /**
     * Checks if the given {@link GridInventory} fits the required constraints
     * to craft this {@link CraftingRecipe}.
     *
     * @param grid The ItemGrid to check for validity
     * @param world The world this recipe would be used in
     * @return True if the given input matches this recipe's requirements
     */
    boolean isValid(GridInventory grid, World world);

    /**
     * This method is preferred over the {@link #getExemplaryResult()}
     * method, as it customizes the result further depending on the specified
     * input {@param grid}.
     *
     * <p>It is advised to use the output of {@link #getExemplaryResult()},
     * modify it accordingly, and {@code return} it.</p>
     *
     * @param grid The crafting input, typically 3x3 or 2x2
     * @param world The world this recipe would be used in
     * @return An {@link ItemStack} or {@link Optional#empty()} if the given
     *         {@link GridInventory} does not match this recipe's requirements.
     */
    Optional<ItemStack> getResult(GridInventory grid, World world);

    /**
     * A list of items to be added to the inventory of the player when they
     * craft the result. For example, if a player crafts a
     * {@link ItemTypes#CAKE}, the empty buckets are returned to their
     * inventory.
     *
     * @param grid The crafting input, typically 3x3 or 2x2
     * @param world The world this recipe would be used in
     * @return The list of items to be added to the inventory of the player
     *         when the recipe has been fulfilled (possibly empty),
     *         or {@link Optional#empty()} if the given
     *         {@link GridInventory} does not match this recipe's requirements.
     */
    Optional<List<ItemStack>> getRemainingItems(GridInventory grid, World world);

    /**
     * The recipe size is used to determine the priority of this recipe compared
     * to other recipes.
     *
     * @return {@code width * height} for shaped recipes, or the number of
     *         ingredients for shapeless recipes
     */
    int getRecipeSize();

}
