package src.main;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String:");
        String word = sc.next();
        StringBuilder rev = new StringBuilder(word);
        String reverse=rev.reverse().toString();
        if(reverse.equals(word)) {
            System.out.println(word + " is palindrome");
        }
        else{
            System.out.println(word+" not a palindrome");
        }

    }
}
