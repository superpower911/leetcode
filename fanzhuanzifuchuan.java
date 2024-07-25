/**
 * @author Zonda
 * @version 1.0
 * @description TODO
 * @2024/7/23 22:10
 */
public class fanzhuanzifuchuan {
    public static void main(String[] args) {
        System.out.println(reverseWords("a good   example"));
    }
    public static String reverseWords(String s) {
        String trim = s.trim();
        trim = reverseString(trim);
        String[] schar = trim.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        int k = 0;
        for (int i = 0; i < schar.length; i++) {
            if(!reverseString(schar[i]).equals(""))
            stringBuilder.append(reverseString(schar[i]) + " ");
        }
        String string = new String(stringBuilder);
        return string.substring(0,string.length()-1);
    }
    public static String reverseString(String s){
        StringBuilder stringBuilder = new StringBuilder(s);
        return new String(stringBuilder.reverse());
    }
}