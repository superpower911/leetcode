/**
 * @author Zonda
 * @version 1.0
 * @description 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素。元素的顺序可能发生改变。然后返回 nums 中与 val 不同的元素的数量。
 * 假设 nums 中不等于 val 的元素数量为 k，要通过此题，您需要执行以下操作：
 * 更改 nums 数组，使 nums 的前 k 个元素包含不等于 val 的元素。nums 的其余元素和 nums 的大小并不重要。
 * 返回 k。
 * @2024/9/11 12:15
 */
public class LC27 {
    public static void main(String[] args) {
        int i = removeElement(new int[]{3, 2, 2, 3}, 3);
        System.out.println(i);
    }
    public static int removeElement(int[] nums, int val) {
        int index = 0;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                nums[index] = nums[i];
                index++;
                res++;
            }
        }
        return res;
    }
}