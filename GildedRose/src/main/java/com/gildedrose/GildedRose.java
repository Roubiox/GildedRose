package com.gildedrose;

class GildedRose {
    Item[] items;
    static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    static final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
    static final String AGEDBRIE = "Aged Brie";
    static final String CONJURED = "Conjured";

    public GildedRose(Item[] items) {
        this.items = items;
    }


    public void updateQuality() {
        for(Item item : items){
            switch (item.name){
                case SULFURAS :
                    break;

                case BACKSTAGE:
                    updateQualityBackstage(item);
                    break;

                case AGEDBRIE:
                    updateQualityAgedBrie(item);
                    break;
                case CONJURED:
                    updateQualityConjured(item);
                    break;
                default:
                    updateQualityDefault(item);
                    break;
            }
        }
    }

    private void updateQualityBackstage(Item item){
        if (item.quality < 50 ){
            item.quality++;
            if(item.quality < 50 && item.sellIn < 11){
                item.quality++;
            }
            if(item.quality < 50 && item.sellIn < 6){
                item.quality++;
            }
        }

        updateSellIn(item);

        if(item.sellIn < 0){
            item.quality = 0;
        }
    }

    private void updateQualityAgedBrie(Item item){
        if (item.quality < 50 ){
            item.quality++;
        }

        updateSellIn(item);

        if(item.sellIn < 0 && item.quality < 50){
            item.quality++;
        }
    }

    private void updateQualityDefault(Item item){
        if (item.quality > 0 ){
            item.quality--;
        }
        updateSellIn(item);
        if(item.sellIn < 0 && item.quality > 0){
            item.quality--;
        }
    }
    private void updateQualityConjured(Item item){
        if(item.sellIn >= 0){
            item.quality= item.quality - 2;
        }
        if(item.sellIn < 0){
            item.quality= item.quality - 4;
        }
    }
    private void updateSellIn(Item item){
        item.sellIn--;
    }
}