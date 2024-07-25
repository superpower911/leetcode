/**
 * @author Zonda
 * @version 1.0
 * @description TODO
 * @2024/7/23 9:28
 */
public class fanzhuanlianbiao {
    public static void main(String[] args) {

    }
    public ListNode reverseList(ListNode head) {
        ListNode dummyNode = null;
        ListNode pre = dummyNode;
        ListNode cur = head;
        while(cur != null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return cur;
    }
}

