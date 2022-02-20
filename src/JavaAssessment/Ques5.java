package JavaAssessment;

// Q-5 => Write a Java Program to find the second-highest number in an array

import java.util.Arrays;
import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        Integer [] arr = new Integer[n];
        System.out.print("Enter the element of array : ");
        for(int i=0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Second highest elemet is "+arr[n-2]);
    }
}
