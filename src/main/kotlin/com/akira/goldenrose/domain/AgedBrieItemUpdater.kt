package org.example.com.akira.goldenrose.domain

class AgedBrieItemUpdater: CommonItemUpdater() {

    override fun updateQuality(item: Item): Int {
        var newQuality = if (item.sellIn <= 0) item.quality + 2 else item.quality + 1
        return newQuality
    }

}