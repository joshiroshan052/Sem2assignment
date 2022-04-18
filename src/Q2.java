import java.util.Scanner;

public class Q2 {
    //2. Write a program to calculate sum of four numbers taking user input.
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the first no:");
            float num1 = scanner.nextInt();
            System.out.println("Enter the second no:");
            float num2 = scanner.nextInt();

            System.out.println("Enter the third no:");
            float num3 = scanner.nextInt();

            System.out.println("Enter the fourth no:");
            float num4 = scanner.nextInt();

            double sum = num1 + num2 + num3 + num4;
            System.out.println("The sum of four no is" + sum);
        }
}
