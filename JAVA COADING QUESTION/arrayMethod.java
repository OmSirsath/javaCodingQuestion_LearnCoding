import java.util.Arrays;
import java.util.Scanner;

public class arrayMethod {
    //sort Method 

    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter data in array  :");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i = 0 ; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }*/

    // Equal method 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[] = new int[5];
        int arr2[] = new int[5];
        System.out.println("Enter the data in array :");
        for(int i = 0; i<arr1.length; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the data in array 2 :");
        for(int i = 0; i<arr2.length; i++){
            arr2[i] = sc.nextInt();
        }
        boolean b = Arrays.equals(arr1, arr2);
        System.out.println("Is this array is same :" + b);


    }

}
 

