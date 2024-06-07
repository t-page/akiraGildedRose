package com.akira.goldenrose.domain

import kotlin.test.Test
import org.example.com.akira.goldenrose.domain.BasicItemUpdater
import org.example.com.akira.goldenrose.domain.Item
import org.junit.jupiter.api.Assertions.assertEquals

class ItemTest {

    private val updater = BasicItemUpdater()

    @Test
    fun `basic update item decrease quality and sellIn in one`() {
        val item = Item(name="item1", sellIn = 10, quality = 20)

        val updatedItem = updater.update(item)

        assertEquals(9, updatedItem.sellIn)
        assertEquals(19, updatedItem.quality)
    }

    @Test
    fun `decrease quality twice when sellIn date passed`() {
        val item = Item(name="item2", sellIn = 0, quality = 20)

        val updatedItem = updater.update(item)

        assertEquals(-1, updatedItem.sellIn)
        assertEquals(18, updatedItem.quality)
    }

    @Test
    fun `quality is not negative`() {
        val item = Item(name="item3", sellIn = 0, quality = 0)

        val updatedItem = updater.update(item)

        assertEquals(-1, updatedItem.sellIn)
        assertEquals(0, updatedItem.quality)
    }

}