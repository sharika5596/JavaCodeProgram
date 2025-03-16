package sdetjava;

import java.util.Scanner;

public class Armstrongnumber {
    public static void main(String[] args) {
        int r,sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int arm=num;
        int digit = (int)Math.log10(num) + 1;
        while(num>0){
            r= num%10;
            sum=sum+(int)Math.pow(r,digit);
            num=num/10;
        }
        if(arm == sum)
        System.out.print("Armstrong number");
        else
            System.out.print("Not Armstrong number");

    }
}
