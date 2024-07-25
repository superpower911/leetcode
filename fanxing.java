import java.util.List;

/**
 * @author Zonda
 * @version 1.0
 * @description TODO
 * @2024/7/25 15:54
 */
public class fanxing {
    public static void main(String[] args) {

    }
    public static void printlist(List<? extends Object> list){
        for(Object l:list){
            System.out.println(l);
        }
    }
}