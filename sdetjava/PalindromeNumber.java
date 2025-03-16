package sdetjava;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int a=num,rev=0,r;
        while(num>0) {
            r = num % 10;
            rev = rev * 10 + r;
            num = num / 10;
        }
        if(rev==a){
            System.out.print("palindrome");
        }
        else
            System.out.print("not palindrome");
    }

}
