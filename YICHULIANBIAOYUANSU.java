/**
 * @author Zonda
 * @version 1.0
 * @description TODO
 * @2024/7/23 9:09
 */
public class YICHULIANBIAOYUANSU {
    public static void main(String[] args) {

    }
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyNode = new ListNode();
        dummyNode.next = head;
        ListNode virNode = dummyNode;
        while(virNode.next != null){
            if(virNode.next.val == val){
                virNode.next = virNode.next.next;
            }else{
                virNode = virNode.next;
            }
        }
        return dummyNode.next;
    }
}
class ListNode{
    int val;
    ListNode next;
}