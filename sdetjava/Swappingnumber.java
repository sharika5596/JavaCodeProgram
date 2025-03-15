package sdetjava;

import java.util.Scanner;

public class Swappingnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a= scanner.nextInt();
        System.out.print("Enter b: ");
        int b=scanner.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.print("After swapping a="+a+" b="+b);
    }
}
