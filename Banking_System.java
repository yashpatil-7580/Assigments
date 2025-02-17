package Practice_programs;

import java.util.Scanner;

public class Banking_System {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int num;

do {
    System.out.println("Enter 1 to Check Bank Balance");
    System.out.println("Enter 2 to Deposite Money");
    System.out.println("Enter 3 to Withdraw Money");
    System.out.println("Enter 4 to Exit");

    num = sc.nextInt();
    switch (num) {
        case 1:
            float sum = 0.00f;
            System.out.println("Your Current balance is: " + sum + "  Deposite money to add balance");
            break;
        case 2:
            System.out.println("Enter Amount to Deposite:");
            int a = sc.nextInt();
            float result = a + 0.0f;
            System.out.println("Your Amount " + result + "  has been Successfully Deposited");
            break;
        case 3:
            System.out.println("Enter Amount to Withdraw");
            int b = sc.nextInt();




    }
}while(num<4);


    }
}
