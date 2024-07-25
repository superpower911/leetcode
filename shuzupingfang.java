/**
 * @author Zonda
 * @version 1.0
 * @description TODO
 * @2024/7/17 10:38
 */
public class shuzupingfang {
    public static void main(String[] args) {
        int[] ints = new int[]{-4, -1, 0, 3, 10};
        int[] ints1 = sortedSquares(ints);


    }
    public  static int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] res = new int[nums.length];
        int k = nums.length - 1;
        while(left < right){
            if(nums[left]*nums[left] >= nums[right]*nums[right]){
                res[k] = nums[left]*nums[left];
                left--;
                k--;
            } else if (nums[left]*nums[left] <= nums[right]*nums[right]) {
                res[k] = nums[right]*nums[right];
                right++;
                k--;
            }
        }
        return res;
    }
}