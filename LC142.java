/**
 * @author Zonda
 * @version 1.0
 * @description
 * @2024/9/11 16:47
 */
public class LC142 {
    public static void main(String[] args) {

    }
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null || head.next.next == null) return null;
        ListNode fastNode = head.next.next;
        ListNode slowNode = head.next;
        while(fastNode != slowNode){
            if(fastNode != null && fastNode.next != null) fastNode = fastNode.next.next;
            else return null;
            if(slowNode != null) slowNode = slowNode.next;
            else return null;
        }
        ListNode otherNode = head;
        while(otherNode != slowNode){
            otherNode = otherNode.next;
            slowNode = slowNode.next;
        }

        return otherNode;
    }
}