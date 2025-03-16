package sdetjava;

import java.util.Scanner;

public class Reversenumber {
    public static void main(String[] args) {
        int rev=0,r;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        while(num>0){
            r=num%10;
            rev=rev*10+r;
            num=num/10;
        }
        System.out.print("Reverse number: "+rev);

    }
}
