package com.luigidev.junitfundamentals

import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class AssertionsUsersTest {

    private lateinit var bot: User
    private lateinit var luigi: User

    @Before
    fun setup() {
        bot = User("8bits", 1, false)
        luigi = User("Luigi", 18, true)
    }

    @Test
    fun checkHuman() {
        val assertions = Assertions()
        assertFalse(assertions.checkHuman(bot))
        assertTrue(assertions.checkHuman(luigi))
    }

    @Test
    fun checkNotSameUsersTest() {
        assertNotSame(bot, luigi)
    }
}