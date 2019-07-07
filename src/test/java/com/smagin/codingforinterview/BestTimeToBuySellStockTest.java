package com.smagin.codingforinterview;

import com.smagin.codingforinterview.arrays.BestTimeToBuySellStock;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class BestTimeToBuySellStockTest {
    private BestTimeToBuySellStock stock;
    private int[] array1;
    private int[] array2;
    private int[] array3;
    private int[] array4;

    @Before
    public void setUp(){
        stock = new BestTimeToBuySellStock();
        array1 = new int[]{1,2,3};
        array2 = new int[]{1,2,3, 4};
        array3 = new int[]{1,2,3, 5};
        array4 = new int[]{7, 1, 5, 3, 6, 4};
    }

    @Test
    public void computeProfit_withArray1_exprectedValidBehaivour() {
        Integer a  = stock.computeProfit(array1);
        assertThat(a, is(2));
    }

    @Test
    public void computeProfit_withArray2_exprectedValidBehaivour() {
        Integer a  = stock.computeProfit(array2);
        assertThat(a, is(3));
    }

    @Test
    public void computeProfit_withArray3_exprectedValidBehaivour() {
        Integer a  = stock.computeProfit(array3);
        assertThat(a, is(4));
    }

    @Test
    public void computeProfit_withArray4_exprectedValidBehaivour() {
        Integer a  = stock.computeProfit(array4);
        assertThat(a, is(5));
    }
}