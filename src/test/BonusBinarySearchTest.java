package test;

import main.BonusBinarySearch;
import org.junit.Test;

import java.util.function.BinaryOperator;

import static org.junit.Assert.assertEquals;

public class BonusBinarySearchTest {
    int[] sortedNums = {1,1,2,3,4,5,11,12,13,14};

    @Test
    public void binarySearchReturnsIndexWhenFound(){
        assertEquals(2, BonusBinarySearch.binarySearch(sortedNums, 2));
    }

    @Test
    public void binarySearchReturnsNeg1WhenNotFound(){
        assertEquals(-1, BonusBinarySearch.binarySearch(sortedNums, 10));
    }



}
