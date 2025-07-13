import java.util.Scanner;

public class printMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row :");
        int row = sc.nextInt();
        System.out.println("Enter the number of column ");
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        int n = row * col;
        
        System.out.println("Enter the "+ n +" element :");
        for(int i = 0; i<arr.length; i++){      //this loop for row 
            for(int j = 0; j<arr[i].length; j++){      //this loop for column 
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("printed matrix is :");
        for(int i = 0; i<arr.length; i++){      //this loop for row 
            for(int j = 0; j<arr[i].length; j++){      //this loop for column 
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
