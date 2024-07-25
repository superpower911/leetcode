import java.util.HashSet;

/**
 * @author Zonda
 * @version 1.0
 * @description TODO
 * @2024/7/23 20:59
 */
public class wuchongfuzifudezuichangzichuan {
    public static void main(String[] args) {
        String str = "dvdf";
        int i = lengthOfLongestSubstring(str);
        System.out.println(i);
    }
    public static int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = 0;
        int maxLen= 0;
        int len = 0;
        HashSet set = new HashSet();
        while(right < chars.length){
            if(!set.contains(chars[right])){
                //当滑动窗口中没有right指针指向的值
                //将右指针指向的值加入到set中
                set.add(chars[right]);
                //长度加一
                len++;
                //如果长度大于最长长度，就赋值
                if(len > maxLen){
                    maxLen = len;
                }
                //右指针右移
                right++;
             } else{
                //如果右指针指向的值在set中，需要移动左指针直到set中不存在该值
                while(set.contains(chars[right])){
                    //这里一定要注意是先移除左指针指向的那个值，left再++
                    set.remove(chars[left]);
                    left++;
                    len--;//因为指针是左移的，因此len不可能会比maxlen大
                }
                //set中不存在左指针指向的那个值的时候就可以将右指针指向的值加入到set中
                set.add(chars[right]);
                //这个时候右指针就++，len也++
                right++;
                len++;
            }
        }
        return maxLen;
    }
}