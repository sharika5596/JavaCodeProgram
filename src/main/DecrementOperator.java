package src.main;

public class DecrementOperator {
    public static void main(String[] args) {
        int a = 20;
        System.out.println(--a + a++ + a--);
        /* --a -> ex_a = 20 and a value 19
           a++ -> ex_b = 20 and a value 21
           a-- -> ex_c = 19 and a value 20
           ex_a + ex_b + ex_c =34
         */
        System.out.println(a);
    }
}
