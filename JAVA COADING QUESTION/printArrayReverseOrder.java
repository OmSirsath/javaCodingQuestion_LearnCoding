import java.util.Scanner;

public class printArrayReverseOrder {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array element :");
        for(int i = 0; i<a.length; i++){
             a[i] = sc.nextInt();
        }
        // System.out.println("Print array element is :");
        // for(int i = 0; i<a.length; i++){
        //    System.out.println(a[i] + " ");
        // }
        System.out.println("Array Reverse element :");
        for(int i = a.length-1; i>=0; i--){
           System.out.println(a[i] + " ");
        }
    }
}
