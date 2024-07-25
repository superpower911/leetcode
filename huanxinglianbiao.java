/**
 * @author Zonda
 * @version 1.0
 * @description TODO
 * @2024/7/23 14:13
 */
public class huanxinglianbiao {
    public static void main(String[] args) {

    }
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode fastIndex = head.next.next;
        ListNode slowIndex = head.next;
        while(fastIndex != slowIndex && fastIndex != null && fastIndex.next != null){
            fastIndex = fastIndex.next.next;
            slowIndex = slowIndex.next;
        }
        if(fastIndex == null) return null;
        while(head != slowIndex){
            head = head.next;
            slowIndex = slowIndex.next;
        }
        return head;
    }
}