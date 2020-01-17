package problemandsolutions;


public class ArraySort {
    // By using the bubble sort algorithm, write a Java program to sort an integer array of 10 elements in ascending.
    public static void sortArray(int [] arr) {
        int i,j,temp;
        for (i =0;i<arr.length;i++ ) {
            for (j=1;j<arr.length-i;j++) {

                if (arr[j-1]>arr[j]) {
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }

        for (int ele:arr) {
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
        int [] a = {4,3,87,45,38,9,27,23,11,100};
        System.out.println("sorted array is: ");
        sortArray(a);
    }
}