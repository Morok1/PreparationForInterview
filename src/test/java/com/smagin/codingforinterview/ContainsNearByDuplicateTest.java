package com.smagin.codingforinterview;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ContainsNearByDuplicateTest {
    private ContainsNearByDuplicate containsNearByDuplicate;

    @Before
    public void setUp() {
        containsNearByDuplicate = new ContainsNearByDuplicate();
    }

    @Test
    public void containsNearByDuplicate() {
        //arrange
        int[] testArray = new int[]{1, 2, 3, 4, 1};

        //act
        int[] resultArray = containsNearByDuplicate.containsNearByDuplicate(testArray, 1);

        //test
        assertThat(resultArray[0], is(0));
//        assertThat(resultArray[1], is(4));
    }
}