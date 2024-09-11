import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Zonda
 * @version 1.0
 * @给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的
 * 字母异位词
 * 。
 * @Date 2024/9/1119:16
 * @description
 **/
public class LC242 {
    public static void main(String[] args) {
        boolean res = isAnagram("anagram", "nagaram");
        System.out.println(res);
    }
    public static boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        char[] char1 = s.toCharArray();
        char[] char2 = t.toCharArray();
        for (int i = 0; i < char1.length; i++) {
            if(map.containsKey(char1[i])){
                map.put(char1[i],map.get(char1[i])+1);
            }else{
                map.put(char1[i],1);
            }
        }
        for (int i = 0; i < char2.length; i++) {
            if(map.containsKey(char2[i])){
                map.put(char2[i],map.get(char2[i])-1);
            }else{
                return false;
            }
        }
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for(Map.Entry<Character, Integer> entry:entries){
            if(entry.getValue() != 0) return false;
        }
        return true;
    }
}
