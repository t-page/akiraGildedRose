package org.example.domain

data class Item (
    val name: String,
    val sellIn: Int,
    val quality: Int
) {
    fun updateQuality(): Item? {
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
            return Item(name, newSellIn, newQuality)
        }
        return null
    }
}

// Another options:
// Lanza una excepción (IllegalArgumentException) en el caso de que quality sea menor que 0 o mayor que 50
//init {
//    require(quality in 0..50) { "Quality must be between 0 and 50" }
//}

// Para inicializar el objeto, se utiliza item.create y cambiará la calidad al máximo/mínimo en caso de estar por encima/debajo de 50/0
//companion object {
//    fun create(name: String, sellIn: Int, quality: Int): Item {
//        val adjustedQuality = quality.coerceIn(0, 50)
//        return Item(name, sellIn, adjustedQuality)
//    }
//}