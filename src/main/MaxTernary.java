package src.main;

import java.util.Scanner;

public class MaxTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a= sc.nextInt();
        System.out.println("Enter the second number: ");
        int b= sc.nextInt();
        int max= a>b?a:b;
        System.out.println("the max number is: "+max);

    }
}
