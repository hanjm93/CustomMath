package com.ez.myutils

import java.lang.IllegalArgumentException

class MyMath {
    fun plus(a: Int, b: Int): Int {
        return a + b
    }

    fun minus(a: Int, b: Int): Int {
        return a - b
    }

    fun times(a: Int, b: Int): Int {
        return a * b
    }

    fun div(a: Int, b: Int): Int {
        if (b == 0) {
            throw IllegalArgumentException("Div by Zero error")
        } else {
            return a / b
        }
    }
}