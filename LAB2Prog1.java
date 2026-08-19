import java.util.Scanner;

public class LAB2Prog1 {
    public static void main(String...args){
        Scanner s = new Scanner(System.in);
        IO.println("Enter a Number:");
        int x = s.nextInt();
        IO.println("Enter a Number:");
        int y = s.nextInt();
        int check = x/y;
        IO.println(check);
    }
}