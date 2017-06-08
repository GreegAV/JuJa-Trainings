package ua.com.juja.core;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by avg-m on 06/06/2017.
 */
public class CoinsChangerTest {

    @Test
    public void test(){
        assertEquals(4, CoinsChanger.getCombinations(5));
        assertEquals(11, CoinsChanger.getCombinations(10));
        assertEquals(3953, CoinsChanger.getCombinations(100));
        assertEquals(58030, CoinsChanger.getCombinations(200));

    }
}
