import java.util.Scanner;

public class sortDecendingOrder {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the Array element :");
        for(int i = 0; i<5; i++){
             arr[i] = sc.nextInt();
        }
        for(int i = 0; i<5; i++){
            for(int j =1+i; j<5 ;j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Array in Ascending Order :");
        for(int i = 0; i<5; i++){
             System.out.println(arr[i]);
        }
        
    }
}
