import java.util.Scanner;

class jaggedArray{
    public static void main(String[] args) {
        int[][] a= new int[3][];
        Scanner s = new Scanner(System.in);
        for(int i=0;i<3;i++){
            System.out.println("rs");
            int rs = s.nextInt();
            a[i] = new int[rs];
            for(int j=0;j<a[i].length;j++){
                System.out.print("element: ");
                a[i][j] =s.nextInt();
            }
        }
        System.out.println("jagged array:");
        for(int[] x: a){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println("");
        }
        }
}