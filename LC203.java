/**
 * @author Zonda
 * @version 1.0
 * @description 删除链表元素
 * @2024/9/11 14:18
 */
public class LC203 {
    public static void main(String[] args) {

    }
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyNode = new ListNode();
        dummyNode.next = head;
        ListNode cur = dummyNode;
        while(cur != null){
            while(cur.next != null && cur.next.val == val){
               cur.next = cur.next.next;
            }
            cur = cur.next;
        }
        //切记head有可能已经被删除了，所以应该返回的是dummyNode的next
        return dummyNode.next;
    }
}
class ListNode{
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}