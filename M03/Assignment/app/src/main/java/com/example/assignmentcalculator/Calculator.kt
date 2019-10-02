package com.example.assignmentcalculator

class Calculator(private val math: Math) {
    fun add(a: Float, b: Float): Float{
        return math.addNumbers(a, b)
    }
}