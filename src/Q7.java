import java.util.Scanner;

//7. Take name, roll number and field of interest from user and print in the format below :Hey,
//my name is xyz and my roll number is xyz. My field of interest are xyz.
public class Q7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your name:");
        String name=scanner.nextLine();
        System.out.println("Enter your roll no:");
        int roll_no=scanner.nextInt();
        System.out.println("Enter your field of interest:");
        String interest=scanner.nextLine();

        System.out.println("Hey,my name is "+name);
        System.out.println("My roll no is"+roll_no);
        System.out.println("MY field of interest is "+interest);
    }
}
