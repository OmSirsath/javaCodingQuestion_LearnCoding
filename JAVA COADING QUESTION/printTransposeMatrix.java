import java.util.Scanner;

public class printTransposeMatrix {
    public static void main(String[] args) {
        int arr[][] = new int[2][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data in array : ");
        for(int i = 0; i<2; i++){
            for(int j = 0; j<2; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("print data in array : ");
        for(int i = 0; i<2; i++){
            for(int j = 0; j<2; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("the transpose matrix is : ");
        for(int i = 0; i<2; i++){
            for(int j = 0; j<2; j++){
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
