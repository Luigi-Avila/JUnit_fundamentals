package com.luigidev.junitfundamentals

import org.junit.Assert.*
import org.junit.Test

class AssertionsTest{

    @Test
    fun getLuckyNumberTest(){
        val assertions = Assertions()
        val array = arrayOf(21, 117) // Expected values
        //val array = arrayOf(21, 117) // run this to view the custom message
        assertArrayEquals("Custom message for testing ",array, assertions.getLuckyNumber())
    }
}