package java.hacker;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class SparseArraySolution {


    public static int[] sparseArray() {
        return new int[]{1, 2, 3};
    }

    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("input/input10.txt");
        Scanner in = new Scanner(input);
     //   parseFile(in);
//            inputArray.add(in.next());

//        n.stream().forEach(System.out::println);
//        q.stream().forEach(System.out::println)

        ArrayList n_q = new ArrayList();
        List n = new ArrayList();
        List q  = new ArrayList();
//        int count = 0;
//        for (int i = 0; i < nAndQ.size(); i++) {
//                n_q.add(inputArray.subList(count, count + (int) nAndQ.get(i)));
//                count += (int) nAndQ.get(i);
//        }
//
//        for (int i = 0; i < nAndQ.size(); i++) {
//            for (int j = i + 1; j < nAndQ.size(); j++) {
//                n.add(n_q.get(i));
//                q.add(n_q.get(i + 1));
////                q.set(i, nAndQ.get(i+1));
//            }
//        }
        for (int i = 0; i < n_q.size(); i++) {
            for (int j = i +1; j < n_q.size(); j++) {
                System.out.println(n_q.get(i).getClass());
//                q.set(i, nAndQ.get(i+1));
            }
        }

//        for(int i = 0; i < n_q.size(); i++){
//            n[i] = (Array) n_q.get(i);
//           q[i + 1] = (Array) n_q.get(i + 1);
//        }

//        System.out.println(nAndQ.size());
//        n_q.stream().forEach(System.out::println);
        List filterd = new ArrayList();
        n.stream().flatMap(x -> Stream.of(x)).forEach(System.out::println);

//                .filter(nn -> q.stream().anyMatch(qq -> qq.equals(nn))).collect(Collectors.toList());

//        filterd.forEach(System.out::println);
//        q.stream().forEach(System.out::println);
        //todo use Collectors.groupingBy for the final solution
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

/*    protected static Pair<String[], Integer[]> parseFile(Scanner in) {
        ArrayList<Integer> nAndQ = new ArrayList<>();
        ArrayList<String> inputArray = new ArrayList<String>();
        while (in.hasNextLine()) {
            if (in.hasNextInt()) {
                nAndQ.add(Integer.valueOf(in.nextInt()));
            } else {
                inputArray.add(in.next());
            }
        }
        return new Pair<String[], Object[]>(nAndQ.toArray(new String[]), inputArray.toArray(new Integer[]));
    }*/

}



