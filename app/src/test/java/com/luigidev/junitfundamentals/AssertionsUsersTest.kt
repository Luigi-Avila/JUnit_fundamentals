package com.luigidev.junitfundamentals

import org.junit.After
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
        println("Before")
    }
    // For each test, JUnit run before and after
    // The flow is like this
    // Before/Test/After   Before/Test/After

    @After
    fun tearDown(){
        bot = User()
        luigi = User()
        println("After")
    }

    @Test
    fun checkHuman() {
        val assertions = Assertions()
        assertFalse(assertions.checkHuman(bot))
        assertTrue(assertions.checkHuman(luigi))
        println("CheckHuman")
    }

    @Test
    fun checkNotSameUsersTest() {
        assertNotSame(bot, luigi)
        println("Not the same")
    }
}