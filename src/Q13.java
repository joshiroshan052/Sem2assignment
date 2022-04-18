//*13. If the marks of Robert in three subjects are entered through keyboard (each out of 100 ),
//write a program to calculate his total marks and percentage marks.
import java.util.Scanner;
public class Q13{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the marks of first sub");
        double f=scanner.nextDouble();
        System.out.println("Enter the marks of second sub");
        double s=scanner.nextDouble();
        System.out.println("Enter the marks of third sub");
        double t=scanner.nextDouble();

        double t_marks=f+s+t;
        double percent=(f+s+t)/3;
        System.out.println("your total marks is"+t_marks);
        System.out.println("your total percent is"+percent);

    }
}
