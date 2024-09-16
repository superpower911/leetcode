import java.util.ArrayList;
import java.util.List;

/**
 * @author Zonda
 * @version 1.0
 * @Date 2024/9/1511:05
 * @description 回溯算法 这出所有的k个的子序列
 **/
public class LC77 {
    public static void main(String[] args) {
        combine(4,2);
        System.out.println("dd");
    }
    public static List<List<Integer>> combine(int n, int k) {
        ArrayList<Integer> path = new ArrayList<>();
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        backtracking(k,n,1,path,res);
        return res;
    }
    public static void backtracking(int k,int n,int startIndex, ArrayList<Integer> path,ArrayList<List<Integer>> res){
        if(path.size() == k){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int p:path){
                temp.add(p);
            }
            res.add(temp);
            return;
        }
        for (int i = startIndex; i <= n; i++) {
            path.add(i);
            backtracking(k,n,i+1,path,res);
            path.remove(path.size()-1);
        }
    }
}
