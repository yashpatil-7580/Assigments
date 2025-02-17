package Practice_programs;

import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Year:");
        int val=sc.nextInt();
        if (val%4==0){
            System.out.println("This is a Leap Year");
        }else {
            System.out.println("This is not a leap year");
        }

    }

}
