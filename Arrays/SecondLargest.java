package Arrays;

public class SecondLargest {

    public int findSecondLargestElement(int[] a){
        int largest=0;
        int secondlargest=0;
        for(int num:a){
            if(num>largest){
                secondlargest=largest;
                largest=num;
            } else if (num>secondlargest && num!=largest) {
                secondlargest=num;
            }
        }
        return secondlargest;
    }


    public static void main(String[] args){
        int[] arr ={150,40,30,120,10};
        SecondLargest obj = new SecondLargest();
        int large=obj.findSecondLargestElement(arr);
        System.out.println(large);

    }
}
