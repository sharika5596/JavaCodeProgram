package sdetjava;

import java.util.Scanner;

public class Stringreverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = scanner.next();
        char[] ch = s.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            System.out.print(ch[i]);
        }
    }
}
