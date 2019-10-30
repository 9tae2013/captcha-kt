package com.example.demo

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DemoCaptchaTests {

    @Test
    fun should_display_correct() {
        val data = mapOf(
                "0,1,1,1" to "1 - One",
                "1,1,1,1" to "One - 1"
        )

        data.forEach { (input, expected) ->
            val i = input.split(",").toTypedArray()

            val result = captcha(i[0].toInt(), i[1].toInt(), i[2].toInt(), i[3].toInt())

            assertEquals(expected, result)
        }
    }

}
