package Practice_programs;

import java.util.Scanner;

public class Maven_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num ;
        do {
            System.out.println("Press 1 for Addition");
            System.out.println("Press 2 for Substraction");
            System.out.println("Press 3 for Multiplication");
            System.out.println("Press 4 for Division");
            System.out.println("Press 5 for Exit");
            num=sc.nextInt();

            switch (num) {
                case 1:
                    System.out.println("enter num 1");
                    int num1 = sc.nextInt();
                    System.out.println("enter num 2");
                    int num2 = sc.nextInt();
                    int result = num1 + num2;
                    System.out.println("Addition is: " + result);
                    break;
                case 2:
                    System.out.println("enter num 1");
                    int num3 = sc.nextInt();
                    System.out.println("enter num 2");
                    int num4 = sc.nextInt();
                    int sum = num3 - num4;
                    System.out.println("Substraction is: " + sum);
                    break;
                case 3:
                    System.out.println("enter num 1");
                    int num5 = sc.nextInt();
                    System.out.println("enter num 2");
                    int num6 = sc.nextInt();
                    int s = num5 * num6;
                    System.out.println("Multiplication is: " + s);
                    break;
                case 4:
                    System.out.println("enter num 1");
                    int num7 = sc.nextInt();
                    System.out.println("enter num 2");
                    int num8 = sc.nextInt();
                    int r = num7 / num8;
                    System.out.println("Division is: " + r);
                    break;



            }
        }while(num<5);












    }
}
