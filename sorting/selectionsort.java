import java.util.Scanner;
import java.util.Arrays;
class selectionsort{
    public static int[] sorting(int[] nums){
        for(int i = 0;i<nums.length-1;i++){
            int smallest = i;
            for(int j = i+1;j<nums.length;j++){
                if(nums[smallest]>nums[j]){
                    smallest = j;
                }
            }
            int temp = nums[smallest];
            nums[smallest] = nums[i];
            nums[i] = temp;
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
        System.out.println("After sorting :"+Arrays.toString(result));
    }
}