import java.util.Scanner;

/**
 * @author Zonda
 * @version 1.0
 * @description 在一个城市区域内，被划分成了n * m个连续的区块，每个区块都拥有不同的权值，代表着其土地价值。目前，有两家开发公司，A 公司和 B 公司，希望购买这个城市区域的土地。
 *
 * 现在，需要将这个城市区域的所有区块分配给 A 公司和 B 公司。
 *
 * 然而，由于城市规划的限制，只允许将区域按横向或纵向划分成两个子区域，而且每个子区域都必须包含一个或多个区块。 为了确保公平竞争，你需要找到一种分配方式，使得 A 公司和 B 公司各自的子区域内的土地总价值之差最小。
 *
 * 注意：区块不可再分。
 * @2024/9/11 13:53
 */
public class KM44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();//m行
        int n = scanner.nextInt();//n列
        int[][] list = new int[m][n];
        int[] row = new int[m];
        int[] col = new int[n];
        int total = 0;
        scanner.nextLine();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                list[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += list[i][j];
            }
            total += sum;
            row[i] = sum;
        }
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += list[j][i];
            }
            col[i] = sum;
        }
        int partTotalRow = 0;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            partTotalRow += row[i];
            res = Math.min(res, Math.abs(total - partTotalRow - partTotalRow));
        }
        int partTotalCol = 0;
        for (int i = 0; i < n; i++) {
            partTotalCol += col[i];
            res = Math.min(res, Math.abs(total - partTotalCol - partTotalCol));
        }
        System.out.println(res);
    }
}