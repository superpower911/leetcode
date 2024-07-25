import java.time.LocalDate;

/**
 * @author Zonda
 * @version 1.0
 * @description TODO
 * @2024/7/25 18:06
 */
public class Localdate {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        System.out.println(year);
    }
}