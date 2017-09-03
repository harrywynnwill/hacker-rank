package test;

import src.LeftRotationSolution;

import static org.junit.jupiter.api.Assertions.*;

class LeftRotationSolutionTest {
    @org.junit.jupiter.api.Test
    void leftRotation() {
        assertArrayEquals(new int[]{5, 1, 2, 3, 4}, LeftRotationSolution.leftRotation(new int[]{1, 2, 3, 4, 5}, 4));
    }

}
