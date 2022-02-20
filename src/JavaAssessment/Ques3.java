package JavaAssessment;

// Ques3 => Write a Java Program to iterate ArrayList using for-loop, while-loop, and advance for-loop.

import java.util.ArrayList;
import java.util.Iterator;

public class Ques3 {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("Python");
        arrList.add("Java");
        arrList.add("C++");
        arrList.add("Nodejs");
        arrList.add("Ruby");
        arrList.add("C");

        System.out.println("For loop");
        for (int i = 0; i < arrList.size(); i++) {
            System.out.println(arrList.get(i));
        }

        System.out.println("\nWhile loop");
        Iterator itr = arrList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("\nAdvance for loop");
        for(String lang:arrList){
            System.out.println(lang);
        }
    }
}
