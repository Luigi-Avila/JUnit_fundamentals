package com.luigidev.junitfundamentals

import org.junit.Assert.*
import org.junit.AfterClass
import org.junit.BeforeClass
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(value = Parameterized::class)
class ParameterizedTest(private var currentValue: Boolean, private var currentUser: User) {

    @get:Rule val locationESRule = LocationESRule()

    companion object{

        private var assertions: Assertions? = null

        @BeforeClass @JvmStatic
        fun setupCommon(){
            assertions = Assertions()
        }

        @AfterClass @JvmStatic
        fun tearDown(){
            assertions = null
        }

//        For US users
//        @Parameterized.Parameters @JvmStatic
//        fun getUsersUS() = arrayOf(
//            arrayOf(true, User("Mike", 22)),
//            arrayOf(true, User("Clara", 34)),
//            arrayOf(true, User("Bot64", 4, false)),
//            arrayOf(false, User("Alex", 18))
//        )

//        For ES users
        @Parameterized.Parameters @JvmStatic
        fun getUsersUS() = arrayOf(
            arrayOf(true, User("Mike", 19)),
            arrayOf(false, User("Clara", 14)),
            arrayOf(true, User("Bot64", 4, false)),
            arrayOf(true, User("Alex", 18))
        )
    }

    @Test
    fun isAdultTest(){
//        assertEquals(currentValue, assertions?.isAdult(currentUser))
        assertEquals(currentValue, locationESRule.assertions?.isAdult(currentUser))
    }

}