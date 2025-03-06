package src.main;

import java.util.Locale;
import java.util.Scanner;

public class CountVowelConsonant {
    public static void main(String[] args) {
        int vcount = 0;
        int ccount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String str = sc.next();
        String s1=str.toUpperCase();
        char[] s = s1.toCharArray();
        for(char ch : s){
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                vcount++;
            }
            else{
                ccount++;
            }
        }
        System.out.println("In the given String "+str+" the vowel count is: "+vcount+" the consonant count is: "+ccount);

    }
}
