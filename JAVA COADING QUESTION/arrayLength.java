import java.util.Scanner;

public class arrayLength {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size array :");
        int size = sc.nextInt();
        System.out.println("Enter the array element :");
          int arr[] = new int[size];

        for(i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();       //taking input array
        }
        // System.out.println(" Printed array element is :");
        // for(i = 0; i<arr.length; i++){
        //    System.out.println(arr[i] + " ");     //print the  array element 
        // }
            System.out.println("the length of array is :" + arr.length);
       

    }
}
