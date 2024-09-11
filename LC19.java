/**
 * @author Zonda
 * @version 1.0
 * @description
 * @2024/9/11 16:26
 */
public class LC19 {
    public static void main(String[] args) {

    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;
        int len = 0;
        ListNode cur = head;
        while(cur != null){
            cur = cur.next;
            len++;
        }
        ListNode dummyNode = new ListNode();
        cur = dummyNode;
        dummyNode.next = head;
        for (int i = 0; i < len-n; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return dummyNode.next;
    }
}