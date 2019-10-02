package com.example.assignmentcalculator

import org.mockito.Mockito
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock
import kotlin.test.Test
import kotlin.test.assertEquals

class MathTest {
    val math = mock(Math::class.java)
    val calculator = Calculator(math)


    //test the addition
    @Test
    //mock
    fun addition() {
        val num1 = 1.0f
        val num2 = 2.0f
        val expected = 3.0f
        `when`(math.addNumbers(num1, num2)).thenReturn(expected)
    //execute
        val sum = calculator.add(num1, num2)
        assertEquals(expected, sum)


    }
}