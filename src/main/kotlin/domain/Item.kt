package org.example.domain

data class Item (
    val sellIn: Int,
    val quality: Int
) {
    fun updateQuality(): Item {
        val newSellIn = sellIn - 1
        val newQuality = quality - 1
        return Item(newSellIn, newQuality)
    }
}