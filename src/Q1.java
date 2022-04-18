//Write a program to take student details as input and display the result.
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner myMark = new Scanner (System.in);
        System.out.print("Enter your name: ");
        String name = myMark.nextLine();
        System.out.print("Enter your Class:");
        float c =myMark.nextFloat();
        System.out.print("Enter your roll number:");
        float roll = myMark.nextFloat();
        System.out.print("Enter your Physics Mark:");
        float phy = myMark.nextFloat();
        System.out.print("Enter your Math Mark:");
        float math = myMark.nextFloat();
        System.out.print("Enter your Chemistry Mark:");
        float chem = myMark.nextFloat();
        System.out.print("Enter your Biology Mark");
        float bio = myMark.nextFloat();
        System.out.print("Enter your Nepali Mark");
        float nep = myMark.nextFloat();
        float totalmark = (phy+math+chem+bio+nep);
        double percent= totalmark/500.0 * 100.0;
        String g= "";
        g = (percent>70 && percent<100) ? "First class"
                :(percent>=59 && percent<70) ? "Upper Second class"
                :(percent>=49 && percent <59) ? "Second class"
                :(percent>=0 && percent < 39) ? "Third class":"Fail";
        System.out.println("Total Mark ="+totalmark);
        System.out.println("Percentage ="+percent);
        System.out.println("Grade="+g);


    }


}
