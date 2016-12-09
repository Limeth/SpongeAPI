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
package org.spongepowered.api.statistic;

import static org.spongepowered.api.util.generator.dummy.DummyObjectProvider.createFor;

public final class UniversalStatistics {

    // SORTFIELDS:ON

    public static final UniversalStatistic BLOCKS_BROKEN = createFor(UniversalStatistic.class, "BLOCKS_BROKEN");

    public static final UniversalStatistic ITEMS_CRAFTED = createFor(UniversalStatistic.class, "ITEMS_CRAFTED");

    public static final UniversalStatistic ITEMS_USED = createFor(UniversalStatistic.class, "ITEMS_USED");

    public static final UniversalStatistic ITEMS_BROKEN = createFor(UniversalStatistic.class, "ITEMS_BROKEN");

    public static final UniversalStatistic ITEMS_PICKED_UP = createFor(UniversalStatistic.class, "ITEMS_PICKED_UP");

    public static final UniversalStatistic ITEMS_DROPPED = createFor(UniversalStatistic.class, "ITEMS_DROPPED");

    public static final UniversalStatistic ENTITIES_KILLED = createFor(UniversalStatistic.class, "ENTITIES_KILLED");

    public static final UniversalStatistic KILLED_BY_ENTITY = createFor(UniversalStatistic.class, "KILLED_BY_ENTITY");

    // SORTFIELDS:OFF

    private UniversalStatistics() {
    }

}
