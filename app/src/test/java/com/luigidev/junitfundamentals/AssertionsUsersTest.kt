package com.luigidev.junitfundamentals

import org.junit.After
import org.junit.AfterClass
import org.junit.Assert.*
import org.junit.Before
import org.junit.BeforeClass

import org.junit.Test

class AssertionsUsersTest {

    private lateinit var bot: User

    companion object {
        private lateinit var luigi: User
        @BeforeClass @JvmStatic
        fun setupCommon() {
            luigi = User("Luigi", 18, true)
            println("BeforeClass")
        }

        // In this case we set Luigi because it is used in all tests but
        // BeforeClass annotation is useful when we need to set up a database or heavy objects
        // For each test, JUnit runs before and after but this time is at the end of all
        // The flow is like this
        // BeforeClass/  Before/Test/After   Before/Test/After /AfterClass

        @AfterClass @JvmStatic
        fun tearDownCommon(){
            luigi = User()
            println("AfterClass")
        }
    }


    @Before
    fun setup() {
        bot = User("8bits", 1, false)
        luigi = User("Luigi", 18, true)
        println("Before")
    }

    // For each test, JUnit runs before and after
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

    @Test
    fun checkSameUsersTest(){
        val copyLuigi = luigi
        //This validate the object's reference
        assertSame(copyLuigi, luigi)
        println("checkSameUsers")
    }

    @Test
    fun checkNotNullUserTest(){
        val assertions = Assertions()
        assertNotNull(assertions.checkHuman(luigi))
        println("checkNotNullUser")
    }
}