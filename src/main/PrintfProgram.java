package src.main;

public class PrintfProgram
{
    public static void main(String[] args) {
        int num = 9;
        System.out.println("Multiplication Table of " +num+":");
        for(int i=1;i<=10;i++) {
            System.out.printf("%d*%d=%d%n", num,i,(num * i));
        }
    }
}
