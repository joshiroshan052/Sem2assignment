import java.util.Scanner;

//5. Take two integer inputs from user. First calculate the sum of two then product of two.
//Finally, print the sum and product of both obtained results.
public class Q5{
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

        float obtained_num1=sum;
        float obtained_num2=product;

        float sum1=obtained_num1+obtained_num2;
        float product1=obtained_num1*obtained_num2;

        System.out.println("the sum of obtained no is:"+sum1);
        System.out.println("the product of obtained nos is:"+product1);
    }
}
