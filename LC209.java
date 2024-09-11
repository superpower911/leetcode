/**
 * @author Zonda
 * @version 1.0
 * @description TODO
 * @2024/9/11 12:32
 */
public class LC209 {
    public static void main(String[] args) {
        int i = minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3});
        System.out.println(i);
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int leftIndex = 0;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while(sum >= target){
                //每次都要判断一下,因为只有sum >= target的时候这个res才是有效的
                res = Math.min(res, i - leftIndex + 1);
                sum -= nums[leftIndex];
                leftIndex++;
            }
        }
        return res == Integer.MAX_VALUE ? 0:res;
    }
}