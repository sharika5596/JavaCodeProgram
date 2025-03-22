package sdetjava;

import java.util.Scanner;

public class Stringeachwordreverse1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = scanner.nextLine();
        String regex = "[\\s]";
        String[] arr = s.split(regex);

        for(int i= arr.length-1;i>=0;i--){
            char[] ch = arr[i].toCharArray();
            for(int j=ch.length-1;j>=0;j--){
                System.out.print(ch[j]);
            }
            System.out.print(" ");
        }

    }
}
