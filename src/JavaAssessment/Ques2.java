package JavaAssessment;

import java.util.HashMap;
import java.util.Scanner;

// Question 2 => Write a Java Program to count the number of words in a string using Hash Map
public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        System.out.println("Enter a string");
        String str = sc.nextLine();
        String [] wrds = str.split(" ");
        for(String wrd : wrds){
            wrd = wrd.toLowerCase();
            Integer cnt = map.get(wrd);
            if(cnt == null){
                map.put(wrd,1);

            }
            else{
                map.put(wrd,cnt+1);
            }
        }
        System.out.println(map);
    }
}
