package com.example.demo

val numberOperand: (Int) -> String = { it.toString() }
val stringOperand: (Int) -> String = { arrayOf("Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine")[it] }
val operand = fun(pattern: Int, position: Int, number: Int) = listOf(numberOperand, stringOperand)[position xor pattern](number)
val operator = fun(i: Int): String = arrayOf("+", "-", "*")[i]

fun captcha(pattern: Int, left: Int, operator: Int, right: Int) =
        listOf(operand(pattern, 0, left), operator(operator), operand(pattern, 1, right)).joinToString(" ")
