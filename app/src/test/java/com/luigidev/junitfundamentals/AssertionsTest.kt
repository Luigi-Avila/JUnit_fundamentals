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

    @Test
    fun checkNullUser(){
        val user = null
        assertNull(user)
        val assertions = Assertions()
        assertNull(assertions.checkHuman(user))
    }

    @Test
    fun checkNotNullUser(){
        val user = User("Luigi", 23)
        assertNotNull(user)
        val assertions = Assertions()
        assertNotNull(assertions.checkHuman(user))
    }

    @Test
    fun checkNotSameUsersTest(){
        val bot = User("8bit", 1, false)
        val luigi = User("Luigi", 23, true)
        assertNotSame(bot, luigi)
    }

    @Test
    fun checkSameUsersTest(){
        val bot = User("Luigi", 23, true)
        val luigi = User("Luigi", 23, true)
        val copyLuigi = luigi
        //This validate the object's reference
        assertSame(bot, luigi)
    }
}