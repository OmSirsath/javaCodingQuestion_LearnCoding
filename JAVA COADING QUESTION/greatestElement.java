import java.util.Scanner;

public class greatestElement {
    public static void main(String[] args) {
        int arr[] = new int [5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the aray element : ");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i = 1; i<arr.length; i++){
                if(arr[i]>max){
                    max = arr[i];

                }
        }
        System.out.println("Greatest element in array Is :" + max);
    }
}
