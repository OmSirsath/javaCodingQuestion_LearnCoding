import java.util.Scanner;

public class averageArrayElement {
    public static void main(String[] args) {
        int arr[] = new int[5];
        int sum =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array element :");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The array element is :");
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
            sum = arr[i] + sum;
            
        }
        double average = sum/arr.length;
        System.out.println("Average of Array element is :" + average);

    }
}
