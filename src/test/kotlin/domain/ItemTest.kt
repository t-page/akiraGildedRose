package domain

import org.example.domain.Item
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class ItemTest {

    @Test
    fun `Random item should update sellIn and quality correctly`() {
        val itemPositiveSellIn = Item("random", 7, 9)
        val updatedItemPositiveSellIn = itemPositiveSellIn.updateQuality()
        val expectedItemPositiveSellIn = itemPositiveSellIn.copy(sellIn = 6, quality = 8)

        val itemZeroSellIn = Item("random", 0, 9)
        val updatedItemZeroSellIn = itemZeroSellIn.updateQuality()
        val expectedItemZeroSellIn = itemZeroSellIn.copy(quality = 7)

        assertEquals(updatedItemPositiveSellIn, expectedItemPositiveSellIn)
        assertEquals(updatedItemZeroSellIn, expectedItemZeroSellIn)
    }

    @Test
    fun `Aged brie item should update sellIn and quality correctly`() {
        val item = Item("Aged brie", 7, 10)
        val updatedItem = item.updateQuality()
        val expectedItem = item.copy(sellIn = 6, quality = 11)

        val itemZeroSellIn = Item("Aged brie", 0, 10)
        val updatedItemZeroSellIn = itemZeroSellIn.updateQuality()
        val expectedItemZeroSellIn = itemZeroSellIn.copy(quality = 12)

        assertEquals(updatedItem, expectedItem)
        assertEquals(updatedItemZeroSellIn, expectedItemZeroSellIn)
    }

    @Test
    fun `item's quality is never under zero`() {
        val itemZeroQuality = Item("random", 7, 0)
        val updatedItem = itemZeroQuality.updateQuality()
        val expectedItem = itemZeroQuality.copy(sellIn = 6)

        val itemZeroSellIn = Item("random", 0, 1)
        val updatedItemZeroSellIn = itemZeroSellIn.updateQuality()
        val expectedItemZeroSellIn = itemZeroSellIn.copy(sellIn = -1, quality = 0)

        assertEquals(updatedItem, expectedItem)
        assertEquals(updatedItemZeroSellIn, expectedItemZeroSellIn)
    }
}

// Mutability
// DDD + Functional
// TDD desde el inicio?
// Classes q devuelven nuevas intacias de la mismas classes