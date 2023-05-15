package com.java.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldControllerTest {

    @Test
    void hello() {
        HelloWorldController helloWorldController = new HelloWorldController();
        assertEquals("Hello World!", helloWorldController.hello());
    }
}