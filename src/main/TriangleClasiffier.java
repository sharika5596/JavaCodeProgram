package src.main;

import java.util.Scanner;

public class TriangleClasiffier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of side1:");
        int side1 = sc.nextInt();
        System.out.println("Enter length of side2:");
        int side2 = sc.nextInt();
        System.out.println("Enter length of side3:");
        int side3 = sc.nextInt();
        if((side1 == side2 ) && (side3 == side2)){
            System.out.println("all sides are equal");
        } else if ((side1 == side2) || (side3 == side2) || (side1 == side3)) {
            System.out.println("exactly two sides are equal");
        }
        else{
            System.out.println("no sides are equal");
        }
    }
}
