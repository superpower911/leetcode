/**
 * @author Zonda
 * @version 1.0
 * @description 链表相交
 * @2024/9/11 16:32
 */
public class LC0207 {
    public static void main(String[] args) {

    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0;
        int lenB = 0;
        ListNode curA = headA;
        ListNode curB = headB;
        while(curA != null){
            curA = curA.next;
            lenA++;
        }
        while(curB != null){
            curB = curB.next;
            lenB++;
        }
        curA = headA;
        curB = headB;
        if(lenA >= lenB){
            for (int i = 0; i < lenA - lenB; i++) {
                curA = curA.next;
            }
        }else{
            for (int i = 0; i < lenB - lenA; i++) {
                curB = curB.next;
            }
        }
        while(curA != null && curB != null){
            if(curA == curB) return curA;
            curA = curA.next;
            curB = curB.next;
        }
        return null;
    }
}