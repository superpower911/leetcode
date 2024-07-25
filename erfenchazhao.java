/**
 * @author Zonda
 * @version 1.0
 * @description TODO
 * @2024/7/17 10:08
 */
public class erfenchazhao {
    public static void main(String[] args) {

    }
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = left + right / 2;
        while(left <= right){
            if(nums[mid] > target){
                right = mid+1;
                mid = left + right / 2;
            } else if (nums[mid] < target) {
                left = mid-1;
                mid = left + right / 2;
            }else if(nums[mid] == target){
                return mid;
            }
        }
        return -1;
    }
}