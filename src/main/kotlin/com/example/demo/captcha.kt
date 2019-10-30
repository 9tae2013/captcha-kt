package com.example.demo

val numOperand = fun(i: Int): String = i.toString()
val strOperand = fun(i: Int): String = arrayOf("Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine")[i]
val operator = fun(i: Int): String = arrayOf("+", "-", "*")[i]

fun captcha(pattern: Int, left: Int, oper: Int, right: Int) = arrayOf(
        "${numOperand(left)} ${operator(oper)} ${strOperand(right)}",
        "${strOperand(left)} ${operator(oper)} ${numOperand(right)}"
)[pattern]