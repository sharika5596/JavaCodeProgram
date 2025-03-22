package sdetjava;

import java.util.Scanner;

public class Stringeachwordreverse {
    // Java program to show the use of split() method

        public static void main(String[] args)
        {

            // input string having spaces, comma etc.
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a String: ");
            String s = scanner.nextLine();

            // The regex [,\\.\\s] splits the string by
            // commas (,), spaces (\\s), and periods (\\.)
            String regex = "[\\s]";

            // using split() method
            String[] arr = s.split(regex);

            for(int i= arr.length-1;i>=0;i--){
                System.out.print(arr[i]+" ");
            }
        }
}
