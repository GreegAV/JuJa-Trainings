package ua.com.juja.core;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by avg-m on 06/06/2017.
 */
public class CoinsChangerTest {

    @Test
    public void test(){
        assertEquals(4, Lab19.getCombinations(5));
        assertEquals(11, Lab19.getCombinations(10));
        assertEquals(3953, Lab19.getCombinations(100));
        assertEquals(58030, Lab19.getCombinations(200));

    }
}
