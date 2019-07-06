package com.smagin.codingforinterview;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class BestTimeToBuySellStockTest {
    private BestTimeToBuySellStock stock;
    private int[] array;

    @Before
    public void setUp(){
        stock = new BestTimeToBuySellStock();
        array = new int[]{1,2,3};
    }

    @Test
    public void computeProfit() {
        Integer a  = stock.computeProfit(array);
        assertThat(a, is(2));
    }
}