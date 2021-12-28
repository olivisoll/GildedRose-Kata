package com.gildedrose;

final class AgedBrie extends Item{

    private static final int DOUBLE_QUALITY_INCREASE_SELL_IN_THRESHOLD = 0;

    public AgedBrie(final ItemSellIn sellIn, final ItemQuality quality) {
        super(new ItemName(ItemName.AGED_BRIE), sellIn, quality);
    }

    @Override
    void update() {
        decreaseSellIn();
        increaseQuality();

        if (hasToBeSoldInLessThan(DOUBLE_QUALITY_INCREASE_SELL_IN_THRESHOLD)){
            increaseQuality();
        }
    }
}
