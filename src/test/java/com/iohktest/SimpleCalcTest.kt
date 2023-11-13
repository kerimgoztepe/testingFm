package com.iohktest

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SimpleCalcTest {

    @Test
    fun testAdd() {
        val result = SimpleCalc.add(2, 3)
        assertEquals(5, result, "2 + 3 should be 5")
        print(result)
    }

    @Test
    fun testMultiply() {
        val result = SimpleCalc.multiply(2.0, 3.0)
        assertEquals(6.0, result, "2.0 * 3.0 should be 6.0")
        print(result)
    }

    @Test
    fun testSumOfEvens() {
        val arr = intArrayOf(1, 2, 3, 4, 5, 6)
        val result = SimpleCalc.sumOffEvens(arr)
        assertEquals(12, result, "Sum of even elements should be 12 (2 + 4 + 6)")
        print(result)
    }


}


