package com.luigidev.junitfundamentals

import org.junit.After
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class AssertionsUserAdultTest {

    private lateinit var bot: User
    private lateinit var luigi: User

    @Before
    fun setup() {
        luigi = User("Luigi", 18, true)
        bot = User("8bits", 1, false)
    }

    @After
    fun tearDown() {
        luigi = User()
        bot = User()
    }

    @Test
    fun isAdultTest() {
        val assertions = Assertions()
        assertions.setLocation("ES")
        assertTrue(assertions.isAdult(luigi))
        assertTrue(assertions.isAdult(bot))
    }
}