package JavaAssessment;

// Q-4=> Write a Java Program to find the duplicate characters in a string

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String input=sc.nextLine();
        Map<Character, Integer> output = new LinkedHashMap<Character, Integer>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (output.containsKey(ch)) {
                output.put(ch, output.get(ch) + 1);
            } else {
                output.put(ch, 1);
            }

        }

        System.out.println(output);

    }
}
