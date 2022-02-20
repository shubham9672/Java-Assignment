package CollectionAssignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Write a program that prints its arguments  in random order. Do not make  a copy of the argument array. Demonstrate  how to print out the elements  using both streams  and the traditional enhanced for statement.
public class Ques1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);

        Collections.shuffle(list);
        for(int num : list){
            System.out.println(num);
        }
    }
}
