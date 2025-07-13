import java.util.Scanner;

public class printArrayElement{
    public static void main(String[] args) {

        // Thia is called static array         
       /* int a[] = new int[5];
        a[0] = 45;
        a[1] = 32;
        a[2] = 43;
        a[3] = 90;
        a[4] = 41;
        for(int i = 0; i<a.length; i++){
            System.out.println(a[i] + " ");
        } */


        // now we create the dynamic array 

        int size,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        size = sc.nextInt();
        
        int a[] = new int[size];

        for( i = 0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Printed array element is:");
        for(i = 0; i<a.length; i++ ){
            System.out.println(a[i] + " ");
        }


    }
}