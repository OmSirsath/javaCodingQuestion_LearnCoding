import java.util.Arrays;
public class printArrayUsingmethod {
    public static void main(String[] args) {
        //tostring() method 
        String arr[] = {"om","rahul","vishal"};
        System.out.println("tostring :" + Arrays.toString(arr));

        //asList() method
        System.out.println("asList" + Arrays.asList(arr));

        //deepTostring()

        int a[][] = {{22,33},{21,33},{21,67}};
        System.out.println("deepTostring :" + Arrays.deepToString(a));
    }
}
