/**
 * @author Zonda
 * @version 1.0
 * @description 二分查找
 * @2024/9/11 11:56
 */
public class LC_704 {
    public static void main(String[] args) {
        int search = search(new int[]{-1, 0, 3, 5, 9, 12}, 2);
        System.out.println(search);
    }
    public static int search(int[] nums, int target) {
        int leftIndex = 0;
        int rightIndex = nums.length-1;
        while(leftIndex <= rightIndex){
            //注意这里每次取完左右索引再去取中间索引
            int middle = (leftIndex+rightIndex)/2;
            int num = nums[middle];
            if(num > target){
                //middle已经不满足了，排除
                rightIndex = middle - 1;
            }else if(nums[middle] < target){
                leftIndex = middle + 1;
            }else{
                break;
            }
        }
       return -1;

    }
}