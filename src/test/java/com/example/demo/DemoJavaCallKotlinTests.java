package com.example.demo;

import org.junit.jupiter.api.Test;

public class DemoJavaCallKotlinTests {
    @Test
    public void testCall() {
        System.out.println(CaptchaKt.captcha(1, 1, 1, 1));
    }
}
