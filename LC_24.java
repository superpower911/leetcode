/**
 * @author Zonda
 * @version 1.0
 * @description TODO
 * @2024/9/11 15:49
 */
public class LC_24 {
    public static void main(String[] args) {
        swapPairs(null);
    }
    public static ListNode swapPairs(ListNode head) {
        ListNode dummyNode = new ListNode();
        ListNode cur = dummyNode;
        cur.next = head;
        while(cur.next != null && cur.next.next != null){
            ListNode temp1 = cur.next;
            ListNode temp2 = cur.next.next.next;
            cur.next = cur.next.next;
            cur.next.next = temp1;
            temp1.next = temp2;
            cur = temp1;
        }
        return dummyNode.next;
    }
}