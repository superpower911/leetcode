/**
 * @author Zonda
 * @version 1.0
 * @description TODO
 * @2024/7/17 10:31
 */
public class yichuyuansu {
    public static void main(String[] args) {

    }
    public int removeElement(int[] nums, int val) {
        int slow = 0;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                nums[slow] = nums[i];
                slow++;
                k++;
            }
        }
        return k;
    }
}