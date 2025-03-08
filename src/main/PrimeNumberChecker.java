package src.main;

import java.util.Scanner;

public class PrimeNumberChecker {
     static boolean isPrime(int n)
        {
            if (n <= 1)
                return false;
            else {
                for (int i = 2; i <= n / 2; i++)
                    if (n % i == 0)
                        return false;

                return true;
            }
        }
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number:");
            int num = sc.nextInt();
            if (isPrime(num))
                System.out.println(num+" prime number");
            else
                System.out.println(num+" not prime number");
        }
    }
