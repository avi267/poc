package com.example.lld;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleApplicationTest {

    @Test
    public void testAdd() {
        assertEquals(5, SampleApplication.add(2, 3));
    }
}
