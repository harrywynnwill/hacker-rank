package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.IntStream;

public class leftRotationSolution {

    public static int[] leftRotation(int[] a, int d) {
        IntStream stream1 = Arrays.stream(a).skip(d);
        IntStream stream2 = Arrays.stream(a).limit(d);
        IntStream solution = IntStream.concat(stream1, stream2);
        return solution.toArray();
    }

    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("input/input00.txt");
        File output = new File("output/output00.txt");
        Scanner in = new Scanner(input);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] result = leftRotation(a, d);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}