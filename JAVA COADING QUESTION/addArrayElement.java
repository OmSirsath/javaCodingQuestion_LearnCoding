import java.util.Scanner;

public class addArrayElement {
    public static void main(String[] args) {
        int a[] = new int[5];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array element :");
        for(int i = 0; i<a.length; i++){   //length is the attribute of array 
            a[i] = sc.nextInt();
        }
        System.out.println("Array element :");
        for(int i = 0; i<a.length; i++){   //length is the attribute of array 
            System.out.println(a[i] + " ");
             sum = a[i] + sum;
        }
        System.out.println("Sum of array element is :"  + sum);
    }
}
