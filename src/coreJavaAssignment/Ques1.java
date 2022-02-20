package coreJavaAssignment;

// Q1=> Implement your  own abstract  classes and  interfaces

interface oddEven{
    void oddEven(int n);
}

abstract class Abs{
    abstract void fibonacci(int n);
}

class Base extends Abs implements oddEven{
    void fibonacci(int n){
        int a = 0, b = 1;
        for (int i = 1; i <= n; ++i) {
            System.out.print(a + ", ");
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

    public void oddEven(int n) {
        if(n%2==0){
            System.out.println(n+" no is Even");
        }
        else{
            System.out.println(n+" no is Odd");
        }

    }
}
public class Ques1 {
    public static void main(String[] args) {
        Base bss = new Base();
        bss.fibonacci(8);
        bss.oddEven(3);
    }
}
