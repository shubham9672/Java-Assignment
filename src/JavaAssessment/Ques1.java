package JavaAssessment;

import java.util.HashMap;
import java.util.Iterator;

//  Q-1=> Write a Java Program to iterate Hash Map using While and advance for loop
public class Ques1 {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();  //implements map interface
        hm.put(1,"One");
        hm.put(2,"Two");
        hm.put(3, "Three");
        hm.put(4, "Four");
        hm.put(5, "Five");
        Iterator<Integer> it = hm.keySet().iterator();       //keyset is a method
        while(it.hasNext())
        {
            int key=(int)it.next();
            System.out.println("Key = "+key+" Value = "+hm.get(key));
        }
        System.out.println("");
        for (int i: hm.keySet())
        {
            System.out.println("Key = "+i+" Value = "+hm.get(i));
        }
}
}
