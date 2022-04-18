import java.util.Scanner;

/*12. Write a program to enter the values of two variables 'a' and 'b' from keyboard and then
check if both the conditions 'a < 50' and 'a < b' are true.*/
public class Q12{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the first no");
        double f_num=scanner.nextDouble();
        System.out.println("Enter the second no");
        double s_num=scanner.nextDouble();

        String result;
        result=(f_num<50 && f_num<s_num)?"the condition is true": "the condition is not true.";
        System.out.println(result);
    }
}
