import java.util.Scanner;

/**
 * @author Zonda
 * @version 1.0
 * @description 用双指针法运行更快
 * @2024/9/11 12:56
 */
public class KM58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //区间为[0,0]
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = scanner.nextInt();
        }
        scanner.nextLine(); // 消耗掉nextInt()后的换行符
        int leftIndex = 0;
        int rightIndex = 0;
        int sum = list[0];
        String str;
        while(scanner.hasNextLine()){
            //每次输入都用hasNextLine判断一下
            str = scanner.nextLine();
            String[] split = str.split(" ");
            int targetLeft = Integer.parseInt(split[0]);
            int targetRight = Integer.parseInt(split[1]);
            if(targetLeft < leftIndex){
                for (int i = targetLeft; i <= leftIndex-1; i++) {
                    sum += list[i];
                }
                leftIndex = targetLeft;
            }else if(targetLeft > leftIndex){
                for (int i = leftIndex; i < targetLeft; i++) {
                    sum -= list[i];
                }
                leftIndex = targetLeft;
            }
            if(targetRight < rightIndex){
                for (int i = targetRight+1; i <= rightIndex; i++) {
                    sum -= list[i];
                }
                rightIndex = targetRight;
            }else if(targetRight > rightIndex){
                for (int i = rightIndex+1; i <= targetRight; i++) {
                    sum += list[i];
                }
                rightIndex = targetRight;
            }
            System.out.println(sum);
        }
    }
}