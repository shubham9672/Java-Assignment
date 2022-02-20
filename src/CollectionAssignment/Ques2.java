package CollectionAssignment;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Ques2 {
    static final Comparator<String> cmp = new Comparator<String>() {
        public int compare(String str1, String str2){
            return str1.compareTo(str2);
        }
    };

    public static void main(String[] args){
        SortedSet<String> s = new TreeSet<String>(cmp);
        String arr[] = {"Apple","Mango", "apple", "Papaya","Grapes","papaya"};
        for(String str : arr){
            s.add(str);
        }
        System.out.println(s.size() + " distinct words: " + s);
    }
}
