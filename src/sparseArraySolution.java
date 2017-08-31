package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class sparseArraySolution {


    public static int[] sparseArray() {
        return new int[]{1, 2, 3};
    }

    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("input/input10.txt");
        Scanner in = new Scanner(input);
        int total = 0;
        List n = new ArrayList();
        List q = new ArrayList();
        List inputArray = new ArrayList();
        //use regex to pull out the numbers
//            total += in.nextInt();
        int num = 0;
        while (in.hasNextLine()) {
            if (in.hasNextInt()) {
                n.add(Integer.parseInt(in.next()));
            } else {
                inputArray.add(in.next());
            }

//              in.nextLine();

//                   if(in.hasNextInt()){
//                       q.add(in.nextInt());
//                   }
//        int num2 = in.nextInt();
        }
//            inputArray.add(in.next());

//        n.stream().forEach(System.out::println);
//        q.stream().forEach(System.out::println)


        int count = 0;
        for (int i = 0; i < n.size(); i++) {
            System.out.println(count);
            System.out.println(inputArray.subList(count, count + (Integer) n.get(i)));
            count += (int) n.get(i);
        }
//            List<String> answer = n.forEach(
//                    x -> inputArray.stream().limit((int) x).collect(Collectors.toList()));
//
//        @Test
//        public final void givenList_whenParitioningIntoNSublistsUsingGroupingBy_thenCorrect() {
//            List<Integer> intList = Lists.newArrayList(1, 2, 3, 4, 5, 6, 7, 8);
//
//            Map<Integer, List<Integer>> groups =
//                    intList.stream().collect(Collectors.groupingBy(s -> (s - 1) / 3));
//            List<List<Integer>> subSets = new ArrayList<List<Integer>>(groups.values());
//
//            List<Integer> lastPartition = subSets.get(2);
//            List<Integer> expectedLastPartition = Lists.<Integer> newArrayList(7, 8);
//            assertThat(subSets.size(), equalTo(3));
//            assertThat(lastPartition, equalTo(expectedLastPartition));
//        }

//        inputArray.stream().map
//        inputArray.subList()
//        inputArray.stream().filter()
//        for(int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }
//        int J = in.nextInt();
//        System.out.println(total);
        }

    }



