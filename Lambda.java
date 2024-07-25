/**
 * @author Zonda
 * @version 1.0
 * @description TODO
 * @2024/7/25 17:35
 */
public class Lambda {
    public static void main(String[] args) {
        // 使用Lambda表达式创建B接口的实例
        B b = (int d) -> System.out.println(d);

        // 调用show方法，打印传入的a
        b.show(10);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("你好");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

    }
}
@FunctionalInterface
interface B{
    void show(int c);
}
@FunctionalInterface
interface A{
    void show();
}