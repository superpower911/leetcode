import java.util.HashSet;

/**
 * @author Zonda
 * @version 1.0
 * @description TODO
 * @2024/9/11 21:00
 */
public class LC349 {
    public static void main(String[] args) {
        int[] res = intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2});
        for(int r:res){
            System.out.println(r);
        }
    }
    public static  int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();
        if(nums1.length > nums2.length){
            for (int i = 0; i < nums1.length; i++) {
                set.add(nums1[i]);
            }
            for (int i = 0; i < nums2.length; i++) {
                if(set.contains(nums2[i])){
                    res.add(nums2[i]);
                }
            }
        }else{
            for (int i = 0; i < nums2.length; i++) {
                set.add(nums2[i]);
            }
            for (int i = 0; i < nums1.length; i++) {
                if(set.contains(nums1[i])){
                    res.add(nums1[i]);
                }
            }
        }
        int[] list = new int[res.size()];
        int i = 0;
        for(int r:res){
            list[i] = r;
            i++;
        }
        return list;
    }
}