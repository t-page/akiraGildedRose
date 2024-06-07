package org.example.com.akira.goldenrose.domain

abstract class CommonItemUpdater : ItemUpdater {

    override fun update(item: Item): Item {
        val newSellIn = updateSellIn(item.sellIn)
        val newQuality = updateQuality(item)
        return Item(item.name, newSellIn, newQuality)
    }

    override fun updateQuality(item: Item): Int {
        var newQuality = if (item.sellIn <= 0) item.quality - 2 else item.quality - 1
        if (newQuality < 0) newQuality = 0
        return newQuality
    }

    private fun updateSellIn(sellIn: Int): Int {
        val newSellIn = sellIn - 1
        return newSellIn
    }
}
