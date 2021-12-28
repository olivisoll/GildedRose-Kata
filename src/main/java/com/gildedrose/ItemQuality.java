package com.gildedrose;

import java.util.Objects;

public class ItemQuality {

    private static final int MAX_QUALITY = 50;
    private static final int MIN_QUALITY = 0;

    private final Integer value;

    public ItemQuality(final Integer value) {
        this.value = value;
    }

    ItemQuality increase(){
        return new ItemQuality(value + 1);
    }

    ItemQuality decrease(){
        return new ItemQuality(value - 1);
    }

    ItemQuality reset(){
        return new ItemQuality(0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemQuality that = (ItemQuality) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "ItemQuality{" +
                "value=" + value +
                '}';
    }
}
