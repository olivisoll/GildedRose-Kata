package com.gildedrose;

import java.util.Objects;

final class ItemName {

    protected static final String AGED_BRIE = "Aged Brie";
    protected static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    protected static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

    private final String value;

    ItemName (final String value){
        this.value = value;
    }

    Boolean isAgedBrie(){
        return AGED_BRIE.equals(value);
    }

    Boolean isBackstagePasses() {
        return BACKSTAGE_PASSES.equals(value);
    }

    Boolean isSulfuras(){
        return SULFURAS.equals(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemName itemName = (ItemName) o;
        return Objects.equals(value, itemName.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "ItemName{" +
                "value='" + value + '\'' +
                '}';
    }
}
