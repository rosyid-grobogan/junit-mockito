package com.rosyid.junitmockito.service;

import org.junit.jupiter.api.Test;
//import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomeBusinessTest {

    @Test
    public void calculateSumEmpty(){
        SomeBusinessImpl business = new SomeBusinessImpl();
        int actualResult = business.calculateSum(new int[] {});
        int expectedResult = 0;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSumOneValue(){
        SomeBusinessImpl business = new SomeBusinessImpl();
        int actualResult = business.calculateSum(new int[] { 5 });
        int expectedResult = 5;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSumManyValue(){
        SomeBusinessImpl business = new SomeBusinessImpl();
        int actualResult = business.calculateSum(new int[] {1,2,3});
        int expectedResult = 6;

        assertEquals(expectedResult, actualResult);
    }

}
