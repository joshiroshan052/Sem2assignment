import java.util.Scanner;

//11. Take 3 inputs from user and check :
//all are equal
//any of two are equal
//( use && || with ternary operator )
public class Q11{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the first no: ");
        int a=scanner.nextInt();
        System.out.println("Enter the second no: ");
        int b=scanner.nextInt();
        System.out.println("Enter the third no: ");
        int c=scanner.nextInt();

        String result;

        result=(a==b && a==c)?"all are equal":(a==c || a==b)?"Two no are equal":"None of them are equal";
        System.out.println(result);
    }
}
