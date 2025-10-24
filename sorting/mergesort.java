import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class mergesort{
    public static void conquer(int[] nums,int left,int mid,int right){
        int[] merged = new int[right-left+1];
        int idx1 = left;
        int idx2 = mid+1;
        int x = 0;
        while(idx1<=mid && idx2<=right){
            if(nums[idx1]<=nums[idx2]){
                merged[x++] = nums[idx1++];
            }
            else{
                merged[x++] = nums[idx2++];
            }
        }
        while(idx1<=mid){
            merged[x++] = nums[idx1++];
        }
        while(idx2<=right){
            merged[x++] = nums[idx2++];
        }
        for(int i = 0,j=left;i<merged.length;i++,j++){
            nums[j] = merged[i];
        }
    }
    public static void divide(int[] nums,int left,int right){
        if(left>=right){
            return;
        }
        int mid = left+(right-left)/2;
        divide(nums,left,mid);
        divide(nums,mid+1,right);
        conquer(nums,left,mid,right);
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
        divide(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
}