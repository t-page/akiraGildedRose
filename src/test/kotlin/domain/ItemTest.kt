package domain

import org.example.domain.Item
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class ItemTest {

    @Test
    fun `Item should update sellIn and quality`() {
        val item = Item(7, 9)
        val updatedItem = item.updateQuality()
        val expectedItem = Item(6, 8)
        //val expectedItem = item.copy(sellIn = 6, quality = 8)  -> de esta manera estaría comprobando que el valor de las propiedades del objeto item han cambiado correctamente, sin tener que crear una nueva instancia del objeto
        assertEquals(updatedItem, expectedItem)
    }
}

// Mutability
// DDD + Functional
// TDD desde el inicio?
// Classes q devuelven nuevas intacias de la mismas classes