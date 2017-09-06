package hacker;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class LeftRotationSolutionTest {
    @Test
    public void leftRotation() throws Exception {
        assertArrayEquals(new int[]{5, 1, 2, 3, 4}, LeftRotationSolution.leftRotation(new int[]{1, 2, 3, 4, 5}, 4));
    }

//    @Test
//    void leftRotation() {
//        assertArrayEquals(new int[]{5, 1, 2, 3, 4}, LeftRotationSolution.leftRotation(new int[]{1, 2, 3, 4, 5}, 4));
//    }


}
