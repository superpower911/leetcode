/**
 * @author Zonda
 * @version 1.0
 * @description TODO
 * @2024/7/24 21:39
 */
public class singleton {
    private static singleton instance = new singleton();
    singleton(){

    }
    public static singleton getInstance(){
        return instance;
    }
}