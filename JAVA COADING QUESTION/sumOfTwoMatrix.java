/*import java.util.Scanner;

public class sumOfTwoMatrix {
    public static void main(String[] args) {
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int c[][] = new int[2][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data in first matrix :");
        for(int i = 0; i<2; i++){       //row
            for(int j = 0; j<2; j++){       //column
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the data in second matrix :");
        for(int i = 0; i<2; i++){       //row
            for(int j = 0; j<2; j++){       //column
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("Printed data in first matrix :");
        for(int i = 0; i<2; i++){       //row
            for(int j = 0; j<2; j++){       //column
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Printed data in second matrix :");
        for(int i = 0; i<2; i++){       //row
            for(int j = 0; j<2; j++){       //column
               System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Addition of two matrix is  :");
        for(int i = 0; i<2; i++){       //row
            for(int j = 0; j<2; j++){     //column
                c[i][j]= a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
 */


 //  user input
import java.util.Scanner;

public class sumOfTwoMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row : ");
        int row =sc.nextInt();
        System.out.println("Enter the number of column : ");
        int col = sc.nextInt();
        int a[][] = new int[row][col];
        int b[][] = new int[row][col];
        int c[][] = new int[row][col];
        
        System.out.println("Enter the data in first matrix :");
        for(int i = 0; i<row; i++){       //row
            for(int j = 0; j<col; j++){       //column
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the data in second matrix :");
        for(int i = 0; i<row; i++){       //row
            for(int j = 0; j<col; j++){       //column
                b[i][j] = sc.nextInt(); 
            }
        }
        System.out.println("Printed data in first matrix :");
        for(int i = 0; i<row; i++){       //row
            for(int j = 0; j<col; j++){       //column
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Printed data in second matrix :");
        for(int i = 0; i<row; i++){       //row
            for(int j = 0; j<col; j++){       //column
               System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Addition of two matrix is  :");
        for(int i = 0; i<row; i++){       //row
            for(int j = 0; j<col; j++){     //column
                c[i][j]= a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
