//import java.util.Scanner;
//
////1. Write a JAVA program to find maximum between two numbers.
//public class ConditionalAssignment {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter first number: ");
//        System.out.println("Enter second number: ");
//        int i = Integer.parseInt(scanner.nextLine());
//        int j = Integer.parseInt(scanner.nextLine());
//        if (i>j){
//            System.out.println("First number is maximum");
//
//        }else{
//            System.out.println("second number is maximum");
//        }
//
//    }
//}
////2. Write a JAVA program to find maximum between three numbers.
//class maxThreenum{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter first number: ");
//        System.out.println("Enter second number: ");
//        System.out.println("Enter third number: ");
//        int i = Integer.parseInt(scanner.nextLine());
//        int j = Integer.parseInt(scanner.nextLine());
//        int k = Integer.parseInt(scanner.nextLine());
//        if (i>j && i>k){
//            System.out.println("I is greatest");
//            } else if (j>i && j>k){
//            System.out.println("J is greatest");
//
//        }else{
//            System.out.println("K is greatest" );
//
//        }
//
//        }
//    }
//
//    //Write a JAVA program to check whether a number is negative, positive or zero.
//class CheckNum{
//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Enter a number: ");
//            int number = Integer.parseInt(scanner.nextLine());
//            if (number>0){
//                System.out.println("number is positive");
//
//            }else if (number<0){
//                System.out.println("number is negative");
//
//            }else{
//                System.out.println("Zero");
//            }
//        }
//    }
//
////Write a JAVA program to check whether a number is divisible by 5 and 11 or not.
//class divideCheck{
//    public static void main(String[] args) {
//        Scanner myobj = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int num1 = myobj.nextInt();
//        if(num1%5==0 && num1%11==0){
//            System.out.println(+num1+" is divisible by 5 and 11");
//        }
//        else{
//            System.out.println(+num1+" is not divisible by 5 and 11");
//        }
//    }
//}
////Write a JAVA program to check whether a number is even or odd.
//class EvenOdd{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int num = scanner.nextInt();
//        if (num%2==0){
//            System.out.println(+num+ " is even");
//
//        }else{
//            System.out.println(+num+" is odd");
//        }
//    }
//}
////Write a JAVA program to check whether a year is leap year or not.
//class leapYear{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter any num");
//        int a = scanner.nextInt();
//        if (a%400==0 || a%4==0 && a%100!=0) {
//            System.out.println(" leap year");
//        } else {
//            System.out.println("not leap year");
//        }
//
//    }
//}
////Write a JAVA program to check whether a character is alphabet or not
//class alphabetCheck{
//    public static void main(String[] args) {
//        Scanner myobj = new Scanner(System.in);
//        System.out.println("enter the character:");
//        char ch = myobj.next().charAt(0);
//        if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))//if (Character.isAlphabetic(ch)){
//        {
//            System.out.print(ch+" is an Alphabet ");
//        }
//        else
//        {
//            System.out.print(ch+" is not an Alphabet ");
//        }
//
//    }
//}
//class vowel{
//    public static void main(String[] args) {
//        Scanner myobj = new Scanner(System.in);
//        System.out.println("Enter the character:");
//        char ch = myobj.next().charAt(0);
//        switch (ch) {
//            case 'a':
//            case 'e':
//            case 'i':
//            case 'o':
//            case 'u':
//                System.out.println(ch + " is vowel");
//                break;
//            default:
//                System.out.println(ch + " is consonant");
//        }
//
//    }
//}
//
//class alphabetdigitspecial{
//    public static void main(String[] args) {
//        Scanner myobj = new Scanner(System.in);
//        System.out.println("Enter the character");
//        char ch = myobj.next().charAt(0);
//        if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
//        {
//            System.out.println(ch+" is Alphabet");
//        }
//        else if(ch>='0'&&ch<='9')
//        {
//            System.out.println(ch+" is Digit");
//        }
//        else
//        {
//            System.out.println(ch+" is special character");
//        }
//    }
//}
//
//class upperlower{
//    public static void main(String[] args) {
//        Scanner myobj =new Scanner(System.in);
//        System.out.println("Enter a character");
//        char ch = myobj.next().charAt(0);
//        if(ch>='a'&&ch<='z'){
//            System.out.println("it is lower case");
//        }
//        else{
//            System.out.println("it is upper case");
//        }
//    }
//}
//
//class weekday{
//    public static void main(String[] args) {
//        Scanner myobj = new Scanner(System.in);
//        System.out.println("Enter a number from 1-7");
//        int num1 = myobj.nextInt();
//        if(num1==1){
//            System.out.println("Sunday");
//        }
//        else if(num1==2){
//            System.out.println("Monday");
//        }
//        else if(num1==3){
//            System.out.println("Tuesday");
//        }
//        else if(num1==4){
//            System.out.println("Wednesday");
//        }
//        else if(num1 ==5){
//            System.out.println("Thursday");
//        }
//        else if(num1 == 6){
//            System.out.println("Friday");
//        }
//        else if(num1 ==7){
//            System.out.println("Saturday");
//        }
//        else{
//            System.out.println("Invalid input! Please enter week number between (1-7).");
//        }
//
//    }
//}
//
//class month {
//    public static void main(String[] args) {
//        int month;
//        int year;
//        Scanner p = new Scanner(System.in);
//
//        System.out.print("Enter month number (1-12): ");
//        System.out.print("Enter year : ");
//        int number_of_DaysInMonth=0;
//        month = p.nextInt();
//        year = p.nextInt();
//        if (month == 1) {
//            System.out.println("JANUARY 31 days");
//            number_of_DaysInMonth = 31;
//        } else if (month == 2) {
//            System.out.println("FEBRUARY 28 or 29 days");
//            if ((year%400==0 || ((year % 4==0) && (year % 100 !=0 )) {
//                number_of_DaysInMonth = 28;
//            }
//        } else if (month == 3) {
//            System.out.println("MARCH 31 days");
//        } else if (month == 4) {
//            System.out.println("APRIL 30 days");
//        } else if (month == 5) {
//            System.out.println("MAY 31 days");
//        } else if (month == 6) {
//            System.out.println("JUNE 30 days");
//        } else if (month == 7) {
//            System.out.println("JULY 31 days");
//        } else if (month == 8) {
//            System.out.println("AUGUST 31 days");
//        } else if (month == 9) {
//            System.out.println("SEPTEMBER 30 days");
//        } else if (month == 10) {
//            System.out.println("OCTOBER 31 days");
//        } else if (month == 11) {
//            System.out.println("NOVEMBER 30 days");
//        } else if (month == 12) {
//            System.out.println("DECEMBER 31 days");
//        } else {
//            System.out.println("Invalid input! Please enter month number between (1-12).");
//        }
//    }
//}
//
//class countnumberofnotes{
//    public static void main(String[] args) {
//        Scanner myobj = new Scanner(System.in);
//        System.out.println("Enter your amount");
//        int amount = myobj.nextInt();
//        int totalNoOfNotes;
//        if (amount%5==0);
//    }
//}
//
//class angleoftriangle{
//    public static void main(String[] args) {
//        Scanner myobj = new Scanner(System.in);
//        System.out.println("Enter first angle");
//        int angl1 = myobj.nextInt();
//        System.out.println("Enter second angle");
//        int angle2= myobj.nextInt();
//        System.out.println("Enter third angle");
//        int angle3= myobj.nextInt();
//        int total=angl1+angle2+angle3;
//        if (total==180){
//            System.out.println("it is valid triangle");
//        }
//        else
//            System.out.println("it is not valid traingle");
//    }
//}
//
//class sideoftriangle{
//    public static void main(String[] args) {
//        Scanner myobj = new Scanner(System.in);
//        System.out.println("Enter first side");
//        int a = myobj.nextInt();
//        System.out.println("Enter second side");
//        int b = myobj.nextInt();
//        System.out.println("Enter third side");
//        int c = myobj.nextInt();
//        if(a<b+c && b<a+c && c<a+b){
//            System.out.println("It can form traingle");
//        }
//        else{
//            System.out.println("It cannot form traingle");
//        }
//
//    }
//}
//
//class traingle{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int a,b,c;
//        System.out.println("Enter 3 sides:");
//        a=sc.nextInt();
//        b=sc.nextInt();
//        c=sc.nextInt();
//        if(a<b+c && b<a+c && c<a+b)
//        {
//            if(a==b && b==c)
//                System.out.println("Equilateral triangle");
//            else if(a==b || b==c || c==a)
//                System.out.println("Isosceles triangle");
//            else
//                System.out.println("Scalene triangle");
//        }
//        else
//            System.out.println("Cannot form a triangle");
//    }
//}
//
//class quadratic{
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the value of a: ");
//        double a = input.nextDouble();
//        System.out.print("Enter the value of b: ");
//        double b = input.nextDouble();
//        System.out.print("Enter the value of c: ");
//        double c = input.nextDouble();
//        double firstRoot;
//        double secondRoot;
//
////        double d= b * b - 4.0 * a * c;
////        if (d> 0.0)
////        {
////            double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
////            double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
////            System.out.println("The roots are " + r1 + " and " + r2);
////        }
////        else if (d == 0.0)
////        {
////            double r1 = -b / (2.0 * a);
////            System.out.println("The root is " + r1);
////        }
////        else
////        {
////            System.out.println("Roots are not real.");
////        }
//        double determinant = (b*b)-(4*a*c);
//        double sqrt = Math.sqrt(determinant);
//        System.out.println(determinant);
//        if (determinant>0){
//            firstRoot = (-b + sqrt)/(2*a);
//            secondRoot = (-b - sqrt)/(2*a);
//            System.out.println("Roots are :: "+firstRoot +"and"+secondRoot);
//
//        }else if(determinant==0){
//            System.out.println("Root is :: "+(-b)/(2*a));
//        }
//    }
//}
//
//class profitlostt{
//    public static void main(String[] args) {
//        Scanner myobj = new Scanner(System.in);
//        System.out.println("Enter Selling price");
//        float sell = myobj.nextFloat();
//        System.out.println("Enter Cost price");
//        float cost = myobj.nextFloat();
//        float profit;
//        float loss;
//        if(cost-sell>0){
//            System.out.println("lose:"+(cost-sell));
//        }
//        else if(cost-sell<0) {
//            System.out.println("profit:"+(sell-cost));
//
//        }
//        else{
//            System.out.println("neutral");
//        }
//
//    }
//}
//
//class studentmark{
//    public static void main(String[] args) {
//        Scanner myobj = new Scanner(System.in);
//        System.out.println("Enter Your Physics Mark:");
//        int phy = myobj.nextInt();
//        System.out.println("Enter Your Chemistry Mark:");
//        int chem = myobj.nextInt();
//        System.out.println("Enter Your Biology Mark:");
//        int bio = myobj.nextInt();
//        System.out.println("Enter Your Mathematics Mark:");
//        int math = myobj.nextInt();
//        System.out.println("Enter Your Computer Mark:");
//        int comp = myobj.nextInt();
//        float total, Percentage;
//        total = phy + chem + bio + comp + math;
//        Percentage = (total / 500) * 100;
//        System.out.println("Your total percentage is:"+Percentage);
//        if(Percentage >= 90)
//        {
//            System.out.println("\n Grade A");
//        }
//        else if(Percentage >= 80)
//        {
//            System.out.println("\n Grade B");
//        }
//        else if(Percentage >= 70)
//        {
//            System.out.println("\n Grade C");
//        }
//        else if(Percentage >= 60)
//        {
//            System.out.println("\n Grade D");
//        }
//        else if(Percentage >= 40)
//        {
//            System.out.println("\n Grade E");
//        }
//        else
//        {
//            System.out.println("\n Fail");
//        }
//
//    }
//}
//
////20.
//class salary
//{
//    public static void main(String args[])
//    {
//        double basic,da,hra;
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the Basic Salary : ");
//        basic = in.nextDouble();
//        double gross;
//        if(basic <=10000)
//        {
//            gross=basic+ (basic * 0.8) +(basic *0.2);
//
//        }
//        else if(basic <=20000)
//        {
//            gross=basic+ (basic * 0.9) +(basic *0.25);
//        }
//        else
//        {
//            gross=basic+ (basic * 0.95) +(basic *0.3);
//        }
//
//        System.out.println("The Gross Salary is :"+gross);
//    }
//}
//
////21.
//class electricity{
//    public static void main(String[] args){
//        Scanner scanner= new Scanner(System.in);
//
//        double Units;
//        double Amount, Total_Amount;
//        double sur_charge;
//
//
//        System.out.print(" Please Enter the Units that you Consumed  : ");
//        Units = scanner.nextInt();
//
//        if (Units < 50)
//        {
//            Amount = Units * 0.50;
//            sur_charge=0.2 * Amount;
//        }
//        else if (Units <= 150)
//        {
//            Amount = 25 + ((Units - 50 ) * 0.75);
//            sur_charge=0.2 * Amount;
//        }
//        else if (Units <= 250)
//        {
//            Amount = 25 + 75 + ((Units - 100 ) * 1.20);
//            sur_charge=0.2 * Amount;
//
//        }
//        else
//        {
//            Amount = 25 + 75 + 120 + ((Units - 200 ) * 1.50);
//            sur_charge = 0.2 * Amount;
//
//        }
//
//        Total_Amount = Amount + (Amount*0.8);
//        System.out.println("\n Electricity Bill  =  " + Total_Amount);
//    }
//
//}
//
//
