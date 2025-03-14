package Arrays;

public class SortedArrayCheck {
    public static void main(String[] args){
        int[] arr ={10,20,30,40,50};
        SortedArrayCheck obj = new SortedArrayCheck();
        boolean flag=obj.isSorted(arr);
        if(flag)
            System.out.println("is sorted array");
        else
            System.out.println("is not sorted array ");


    }
    public boolean isSorted(int[] array){
        for(int i=1;i<= array.length-1;i++){
            if(array[i]<array[i-1]){
                return false;
            }
        }
        return true;
    }

}
