package org.example.domain

data class Item (
    val name: String,
    val sellIn: Int,
    val quality: Int
) {
    fun updateQuality(): Item {
        var newSellIn = sellIn
        var newQuality = quality
        if (quality > 0) {
            when(name) {
                "Aged brie" -> {
                    if (sellIn <= 0) {
                        newQuality += 2
                    } else {
                        newSellIn -= 1
                        newQuality += 1
                    }
                }
                else -> {
                    if (sellIn <= 0) {
                        newQuality -= 2
                    } else {
                        newSellIn -= 1
                        newQuality -= 1
                    }
                }
            }
        }
        return Item(name, newSellIn, newQuality)
    }
}