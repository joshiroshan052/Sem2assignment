//9. Write a program to find square of a number.
//E.g.- INPUT : 2 OUTPUT : 4
//INPUT : 5 OUTPUT : 25

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the no to find square");
        double a=scanner.nextDouble();

//        double square=a*a;
        double square=Math.pow(a,2);
        System.out.println("The square of given no is "+square);

    }
}
