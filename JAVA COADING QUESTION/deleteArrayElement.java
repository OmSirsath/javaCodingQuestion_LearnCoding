import java.util.Scanner;

public class deleteArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();

       int arr[] = new int[size];
        System.out.println("Enter thhe array element :");
        for(int i  = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the location :");
        int loc = sc.nextInt();
    

        for(int i = loc ; i<size-1; i++){
            arr[i] = arr[i+1];
        }
        size--;
        System.out.println("New array element is :");
        for(int i  = 0; i<size; i++){
            System.out.println(arr[i]);
        }

        
    }
}
