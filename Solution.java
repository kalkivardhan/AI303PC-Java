import java.util.Scanner;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] rarr= new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;i<nums.length;j++){
                if(target==nums[i]+nums[j]){
                    rarr[0]=i;
                    rarr[1]=j;
                    return rarr;
                }
            }
        }
    return null;
    }

    public static void main(String...args){
        int[] arr = new int[5];
        Scanner s = new Scanner(System.in); 
        int n = s.nextInt();
        for(int i=0;i<n-1;i++){
            arr[i]=s.nextInt();
        }
        int target = s.nextInt();
        int[] result = twoSum(arr,target);
        System.out.print("[");
        System.out.print(result[0]+","+result[1]);
        System.out.print("]");
    }
}