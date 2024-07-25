/**
 * @author Zonda
 * @version 1.0
 * @description TODO
 * @2024/7/23 13:46
 */
public class lianbiaoxiangjiao {
    public static void main(String[] args) {

    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode indexA = headA;
        ListNode indexB = headB;
        int numA = 0;
        int numB = 0;
        while(indexA != null){
            indexA = indexA.next;
            numA++;
        }
        while(indexB != null){
            indexB = indexB.next;
            numB++;
        }
        if(numA >= numB){
            for (int i = 0; i < numA-numB; i++) {
                headA = headA.next;
            }
        }else{
            for (int i = 0; i < numB-numA; i++) {
                headB = headB.next;
            }
        }
        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        if(headA != null){
            return headA;
        }else{
            return null;
        }
    }
}