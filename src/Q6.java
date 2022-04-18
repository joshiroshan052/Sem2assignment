import java.util.Scanner;

//6. Ask user to give two double input for length and breadth of a rectangle and print area type
//casted to int.
public class Q6{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double length=scanner.nextInt();
        double breadth=scanner.nextInt();


        double area=length*breadth;

        Double a=new Double(area);
        int area_rect=a.intValue();

        System.out.println("the area of rectangle is:"+area_rect);
    }
}