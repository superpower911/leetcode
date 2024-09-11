import java.util.Arrays;

/**
 * @author Zonda
 * @version 1.0
 * @description TODO
 * @2024/9/11 12:20
 */
public class LC977 {
    public static void main(String[] args) {
        int[] res = sortedSquares(new int[]{-4, -1, 0, 3, 10});
        System.out.println(res);
    }
    public static int[] sortedSquares(int[] nums) {
        Arrays.sort(nums);
        int[] res = new int[nums.length];
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        int index = nums.length - 1;
        while(leftIndex <= rightIndex){
            if(nums[leftIndex]*nums[leftIndex] >= nums[rightIndex]*nums[rightIndex]){
                res[index] = nums[leftIndex]*nums[leftIndex];
                leftIndex++;
                index--;
            }else{
                res[index] = nums[rightIndex]*nums[rightIndex];
                rightIndex--;
                index--;
            }
        }
        return res;
    }
}