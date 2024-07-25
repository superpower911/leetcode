/**
 * @author Zonda
 * @version 1.0
 * @description TODO
 * @2024/7/23 9:59
 */
public class liangliangjiaohuanbiaozhongdejiedian {
    public static void main(String[] args) {
    }
    public ListNode swapPairs(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
        ListNode dummyNode = new ListNode();
        dummyNode.next = head;
        ListNode cur = dummyNode;
        while(cur.next != null && cur.next.next != null){
            ListNode temp1 = cur.next;
            ListNode temp2 = cur.next.next.next;
            cur.next = cur.next.next;
            cur.next.next = temp1;
            temp1.next = temp2;
            cur = cur.next.next;
        }
        return dummyNode.next;
    }
}