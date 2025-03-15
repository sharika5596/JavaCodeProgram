package Arrays;

import java.util.Arrays;

public class RemoveDuplicate{
    public static void main(String[] args) {
        int[] arr = {50, 20, 20, 40, 50};
        Arrays.sort(arr);
        System.out.println("sorted array" + Arrays.toString(arr));
        RemoveDuplicate obj = new RemoveDuplicate();
        int len=obj.removeDuplicate(arr);
        System.out.println("array after removing duplicates" + Arrays.toString(Arrays.copyOf(arr,len)));

    }
    public int removeDuplicate(int[] b){
        int index=1;
        for(int i=1;i<=b.length-1;i++){
            if(b[i]!=b[i-1]){
                b[index++]=b[i];
            }
        }
        return index;
    }



}
