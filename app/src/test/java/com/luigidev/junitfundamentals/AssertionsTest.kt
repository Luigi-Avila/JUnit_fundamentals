package com.luigidev.junitfundamentals

import org.junit.Assert.*
import org.junit.Test

class AssertionsTest {

    @Test
    fun getLuckyNumberTest() {
        val assertions = Assertions()
        val array = arrayOf(21, 117) // Expected values
        //val array = arrayOf(21, 117) // run this to view the custom message
        assertArrayEquals("Custom message for testing ", array, assertions.getLuckyNumber())
    }

    @Test
    fun getNameTest() {
        val assertions = Assertions()
        val name = "Luigi"
        val otherName = "Luis"
        assertEquals(name, assertions.getName())
        //this is for values not equals
        assertNotEquals(otherName, assertions.getName())
    }

    @Test
    fun checkHumanTest() {
        val assertions = Assertions()
        val bot = User("8bits", 1, false)
        val juan = User("Juan", 18, true)
        assertFalse(assertions.checkHuman(bot))
        assertTrue(assertions.checkHuman(juan))
    }
}