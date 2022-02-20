package JavaAssessment;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
//Q-6 => Given  a  String,  find  the  first  repeated  character  in  it  using  Stream functions.



public class Ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String input = sc.next();
        input = input.toLowerCase();

        Map<Integer, Long> chars = input.codePoints().mapToObj(cp -> cp)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        int pos = chars.entrySet().stream().filter(e -> e.getValue() > 1L).findFirst().map(Map.Entry::getKey)
                .orElse(Integer.valueOf(Character.MIN_VALUE));

        System.out.println(String.valueOf(Character.toChars(pos)));
    }
}
