package com.gildedrose;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo() {
        List<Item> items = Arrays.asList(ItemFactory.basedOn("foo", 10, 0)) ;
        GildedRose app = new GildedRose();
        app.updateQuality(items);
        assertEquals(new ItemSellIn(9), items.get(0).sellIn());
    }

}
