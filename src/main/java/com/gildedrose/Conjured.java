package com.gildedrose;

final class Conjured extends Item {

    public Conjured(final ItemSellIn sellIn, final ItemQuality quality) {
        super(new ItemName(ItemName.CONJURED), sellIn, quality);
    }

    @Override
    void update() {
        decreaseSellIn();
        decreaseQuality();
        decreaseQuality();
    }
}
