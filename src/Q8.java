import java.util.Scanner;

//8. Take side of a square from user and print area and perimeter of it. Also, calculate SI, Area
//of triangle and Volume of Cube and Cuboid. Take the attributes as user input.
public class Q8{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a side of square;");
        float l=scanner.nextFloat();
        float area=l*l;
        float perimeter= 4l;

        System.out.println("the area of square is"+area);
        System.out.println("the perimeter of square is"+perimeter);
    }
}
class SI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the principal amt");
        double principal =scanner.nextDouble();
        System.out.println("Enter the rate");
        double rate =scanner.nextDouble();
        System.out.println("Enter the time");
        double time =scanner.nextDouble();

        double interest=(principal*time*rate)/100;
        System.out.println("the simple interest is "+interest);
    }
}
class Tri_area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the height of triangle");
        double h=scanner.nextDouble();
        System.out.println("Enter the base of triangle");
        double b=scanner.nextDouble();

        double area=(h*b)/2;
        System.out.println("Area of triangle is"+area);
    }
}
class Vlo_cube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of cube");
        double l=scanner.nextDouble();
        double volume=l*l*l;
        System.out.println("The volume of cube is"+volume);

    }
}
class Cuboid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of cuboid");
        double l=scanner.nextDouble();
        System.out.println("Enter the breadth of cuboid");
        double b=scanner.nextDouble();
        System.out.println("Enter the height of cuboid");
        double h=scanner.nextDouble();
        double volume=l*b*h;
        System.out.println("the volume of cuboid is "+volume);
    }
}
