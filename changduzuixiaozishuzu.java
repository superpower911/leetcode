/**
 * @author Zonda
 * @version 1.0
 * @description TODO
 * @2024/7/17 10:53
 */
public class changduzuixiaozishuzu {
    public static void main(String[] args) {

    }
    public int minSubArrayLen(int target, int[] nums) {
        int slow = 0;
        int res = nums.length;
        int total = 0;
        int sumOfArray = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
            sumOfArray += nums[i];
            while(total >= target){
                res = Math.min(res, i-slow+1);
                total -= nums[slow];
                slow++;
            }
        }
        if(sumOfArray < target) return 0;
        return res;
    }
}