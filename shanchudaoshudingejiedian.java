/**
 * @author Zonda
 * @version 1.0
 * @description TODO
 * @2024/7/23 13:34
 */
public class shanchudaoshudingejiedian {
    public static void main(String[] args) {

    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;
        ListNode dummyNode = new ListNode();
        dummyNode.next = head;
        ListNode targetNode = dummyNode;
        ListNode indexNode = head;
        for (int i = 0; i < n-1; i++) {
            indexNode = indexNode.next;
        }
        while(indexNode.next != null){
            indexNode = indexNode.next;
            targetNode = targetNode.next;
        }
        targetNode.next = targetNode.next.next;
        return dummyNode.next;
    }
}