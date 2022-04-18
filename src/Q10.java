import java.util.Scanner;

//10. Take two different string input and print them in same line. E.g.-
//INPUT : Codes
//Dope
//OUTPUT : CodesDope
public class Q10{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the first string: ");
        String a=scanner.nextLine();

        System.out.println("Enter the second string: ");
        String b=scanner.nextLine();

        System.out.println(a+b);

    }
}
