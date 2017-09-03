package test;

import org.junit.jupiter.api.Test;
import src.SparseArraySolution;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class SparseArraySolutionTest {
    @Test
    void sparseArray() {
        //TODO tests
        // takes the standard in and return a 2D array with n strings and q query
        String[][] test = new String[][]{{"hello", "world"},{"herro", "wolld"}};
        File input = new File("input/input10.txt");
        assertArrayEquals(test, SparseArraySolution.parseInput(input));
    }

}