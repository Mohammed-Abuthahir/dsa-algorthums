import java.util.Scanner;
import java.util.Arrays;
class quicksort{
    public static int partition(int[] nums,int low,int high){
        int pivot = nums[high];
        int i = low -1;
        for(int j = low;j<high;j++){
            if(nums[j]<pivot){
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp  = nums[i+1];
        nums[i+1] = nums[high];
        nums[high] = temp;

        return i+1;
    }
    public static void sorting(int[] nums,int low ,int high){
        if(low < high){
            int pidx = partition(nums,low,high);
            sorting(nums,low,pidx-1);
            sorting(nums,pidx+1,high);
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        sorting(nums,0,nums.length-1);
        System.out.println("After Sorting :"+ Arrays.toString(nums));
    }
}