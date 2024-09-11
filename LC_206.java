/**
 * @author Zonda
 * @version 1.0
 * @description TODO
 * @2024/9/11 15:15
 */
public class LC_206 {
    public static void main(String[] args) {
        reverseList(new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,null))))));
    }
    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while(cur != null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        //已经转向了，所以pre是在头
        return pre;
    }
}