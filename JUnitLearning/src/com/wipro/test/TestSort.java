package com.wipro.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestSort {

    @Test
    public void testSort1() {
        DailyTasks obj = new DailyTasks();
        int[] input = {5, 2, 8, 1, 4};
        int[] expected = {1, 2, 4, 5, 8};

        assertArrayEquals(expected, obj.sortValues(input));
    }

    @Test
    public void testSort2() {
        DailyTasks obj = new DailyTasks();
        int[] input = {10, 7, 3, 9};
        int[] expected = {3, 7, 9, 10};

        assertArrayEquals(expected, obj.sortValues(input));
    }

    @Test
    public void testSort3() {
        DailyTasks obj = new DailyTasks();
        int[] input = {6};
        int[] expected = {6};

        assertArrayEquals(expected, obj.sortValues(input));
    }
}