package com.akira.goldenrose.domain

import kotlin.test.Test
import org.example.com.akira.goldenrose.domain.AgedBrieItemUpdater
import org.example.com.akira.goldenrose.domain.Item
import org.junit.jupiter.api.Assertions.*

class AgedBrieItemUpdaterTest {

    private val updater = AgedBrieItemUpdater()

    @Test
    fun `should increase quality by 1 when sellIn is greater than 0`() {
        val item = Item("Aged Brie", 10, 10)

        val updatedItem = updater.update(item)

        assertEquals(11, updatedItem.quality)
    }

    @Test
    fun `should increase quality by 2 when sellIn date passed`() {
        val item = Item("Aged Brie", 0, 10)

        val updatedItem = updater.update(item)

        assertEquals(12, updatedItem.quality)
    }
}