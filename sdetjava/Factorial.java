package sdetjava;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        Factorial obj = new Factorial();
        int fact= obj.factorial(num);
        System.out.println("Factorial of "+num+": "+fact);
    }
    public int factorial(int n){
        int f=1;
        for(int i=n;i>=1;i--){
            f = i*f;
        }
        return f;
    }

}
