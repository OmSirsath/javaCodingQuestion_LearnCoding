import java.util.Scanner;

public class copyArrayElement {
    public static void main(String[] args) {
         int a[] = new int[5];
         int b[] = new int[5];
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the value in first array :");
         for(int i = 0 ; i<5; i++){
             a[i] = sc.nextInt();
         }
        //  System.out.println(" first array element :");
        //  for(int i = 0 ; i<5; i++){
        //      System.out.println(a[i] + " ");
        //  }
         System.out.println(" second array element :");
         for(int i = 0 ; i<5; i++){
             b[i] = a[i];
             System.out.println(b[i] + " ");
         }


    }
}
