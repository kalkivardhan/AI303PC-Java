import java.util.Arrays;

public class arr {
    public static void main(String...args){
        int[][] a = {{1,2,3},{4,5,6}};
        int[][] b = {{1,2,3},{4,5,6}};
         
        System.out.println(Arrays.deepEquals(a,b));
    }
}
