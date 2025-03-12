package Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static int[] revarray(int[] a){
        int[] b=new int[a.length];
        int temp=0;
        for(int i=a.length-1;i>=0;i--){
                b[temp]=a[i];
                temp++;
            }
        return b;
        }
    public static void main(String[] args){
        int[] arr ={120,40,30,20,10};
        int[] rev= ReverseArray.revarray(arr);
        System.out.println(Arrays.toString(rev));

    }
}
