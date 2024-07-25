/**
 * @author Zonda
 * @version 1.0
 * @description TODO
 * @2024/7/24 21:45
 */
public class maopao {
    public static void main(String[] args) {
        int[] list = {3,4,5,1,2};
        int n = list.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if(list[j+1] > list[j]){
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
        for(int l:list){
            System.out.println(l);
        }
    }
}