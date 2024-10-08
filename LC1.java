import java.util.HashMap;

/**
 * @author Zonda
 * @version 1.0
 * @description TODO
 * @2024/9/11 21:20
 */
public class LC1 {
    public static void main(String[] args) {
    }
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])){
                res[0] = map.get(target - nums[i]);
                res[1] = i;
            }else{
                map.put(nums[i],i);
            }
        }
        return res;
    }
}