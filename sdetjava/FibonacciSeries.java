package sdetjava;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=scanner.nextInt();
        int a=1,b=1;
        System.out.print(0+" "+1+" "+1);
        if(num>3) {
            for (int i = 1; i <= num - 3; i++) {
                int c = a + b;
                a = b;
                b=c;
                System.out.print(" "+c);
            }
        }
    }
}
