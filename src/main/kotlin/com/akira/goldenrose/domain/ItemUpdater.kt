package org.example.com.akira.goldenrose.domain

interface ItemUpdater {
    fun update(item: Item): Item
    abstract fun updateQuality(item: Item): Int
}