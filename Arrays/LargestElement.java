package Arrays;

public class LargestElement {

    public int findLargestElement(int[] a){
        int largest=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>largest){
                largest=a[i];
            }
        }
        return largest;
    }


    public static void main(String[] args){
        int[] arr ={120,40,30,20,10};
        LargestElement obj = new LargestElement();
        int large=obj.findLargestElement(arr);
        System.out.println(large);

    }
}
