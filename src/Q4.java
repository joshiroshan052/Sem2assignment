import java.util.Scanner;

//4. Write a program to take two integer inputs from user and print sum and product of them
public class Q4{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first no:");
        float num1=scanner.nextInt();
        System.out.println("Enter the second no:");
        float num2=scanner.nextInt();

        float sum=num1+num2;
        float product=num1*num2;

        System.out.println("the sum of two no is"+sum);
        System.out.println("the product of two no is"+product);
    }
}