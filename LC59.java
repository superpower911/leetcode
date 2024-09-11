/**
 * @author Zonda
 * @version 1.0
 * @description TODO
 * @2024/9/11 12:46
 */
public class LC59 {
    public static void main(String[] args) {
        int[][] ints = generateMatrix(4);
        System.out.println(ints);
    }
    public static int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int num = 1;
        for (int i = 0; i < n/2; i++) {
            //上
            for (int j = i; j < n-1-i; j++) {
                res[i][j] = num;
                num++;
            }
            for (int j = i; j < n-1-i; j++) {
                res[j][n-1-i] = num;
                num++;
            }
            for (int j = i; j < n-1-i; j++) {
                res[n-1-i][n-1-j] = num;
                num++;
            }
            for (int j = i; j < n-1-i; j++) {
                res[n-1-j][i] = num;
                num++;
            }
        }
        if(n%2 == 1){
            res[n/2][n/2] = num;
        }
        return res;
    }
}