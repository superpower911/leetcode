import java.util.HashSet;

/**
 * @author Zonda
 * @version 1.0
 * @description TODO
 * @2024/9/11 21:08
 */
public class LC202 {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(n != 1){
            if(set.contains(n)) return false;
            set.add(n);
            n = change(n);
        }
        return true;
    }
    public static int change(int n){
        int temp = n;
        int sum = 0;
        while(temp >= 10){
            int k = temp%10;
            sum += k*k;
            temp = temp/10;
        }
        return sum+temp*temp;
    }
}