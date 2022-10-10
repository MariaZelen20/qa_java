package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CatTest {
    Feline feline;

    @Test
    public void getSoundTest() {
        Cat cat = new Cat(feline);
        String actual = cat.getSound();
        String expected = "Мяу";
        assertEquals(expected, actual);
    }

}
