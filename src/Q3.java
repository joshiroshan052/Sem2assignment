import java.util.Scanner;

//3. Write a program to take input of the total marks of four subjects of a student and calculate
//the total percentage secured. Then display the percentage and final result of the student;
//a. If equal to or more than 70 -> First Class
//b. If more than 59 -> Upper second Class
//c. If more than 49 -> Second class
//d. If more than 39 -> Third class and if below than 40 the result is fail.
public class Q3{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        float social, science,math,oop,t_marks, t_percent;
        System.out.println("Enter the mark of social: ");
        social=scanner.nextFloat();
        System.out.println("Enter the mark of science: ");
        science=scanner.nextFloat();
        System.out.println("Enter the mark of math: ");
        math=scanner.nextFloat();
        System.out.println("Enter the mark of oop: ");
        oop=scanner.nextFloat();

        t_marks=social+science+math+oop;
        t_percent=t_marks/4;
        System.out.println("your total marks is "+t_marks);
        System.out.println("your total percent is "+t_percent);

        if(t_percent>=70 && t_percent<=100){
            System.out.println("First class");
        }
        else if(t_percent>=59 && t_percent<=70){
            System.out.println("Upper second class");
        }
        else if(t_percent>=49 && t_percent<=59){
            System.out.println("second class");
        }
        else if(t_percent>=39 && t_percent<=49){
            System.out.println("third class");
        }
        else {
            System.out.println("Fail");
        }

    }
}