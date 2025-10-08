import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
class bubblesort{
    public static int[] sorting(int[] nums){
        System.out.println("Before Sorting :"+Arrays.toString(nums));
        int temp = 0;
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int[] result = sorting(nums);
        System.out.println("After Sorting :"+Arrays.toString(nums));
    }
}