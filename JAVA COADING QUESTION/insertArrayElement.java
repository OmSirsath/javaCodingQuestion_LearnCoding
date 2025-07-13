import java.util.Scanner;

public class insertArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size Of array :");
        int size = sc.nextInt();

        int arr[] = new int[size+1];
        System.out.println("Enter the Array element : ");
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the location :");
        int loc = sc.nextInt();

        System.out.println("Enter the new item :");
        int item = sc.nextInt();

        for(int i = size; i>loc; i--){
            arr[i] = arr[i-1];
        }
         arr[loc]= item;
         size++;
         System.out.println("New array element is : ");
         for(int i = 0; i<size; i++){
           System.out.println(arr[i] + " ");
        }
    }
}
