/**
 * @author Zonda
 * @version 1.0
 * @description TODO
 * @2024/9/11 14:39
 */
public class LC707 {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(1, 2);
        int i1 = myLinkedList.get(1);
        System.out.println(i1);
        myLinkedList.deleteAtIndex(1);
        int i = myLinkedList.get(1);
        System.out.println(i);
    }
}
//设计一个单链表
class MyLinkedList {
    int len = 0;
    Node dummyNode;
    public MyLinkedList() {
        dummyNode = new Node();
    }

    public int get(int index) {
        if(index > len - 1){
            return -1;
        }
        Node cur = dummyNode;
        for (int i = 0; i <= index; i++) {
            cur = cur.next;
        }
        return cur.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0,val);
    }

    public void addAtTail(int val) {
        addAtIndex(len,val);
    }

    public void addAtIndex(int index, int val) {
        if(index > len) return;
        Node cur = dummyNode;
        if(index == len){
            //加到最后边
            while(cur.next != null){
                cur = cur.next;
            }
            cur.next = new Node(val);
            len++;
            return;
        }
        if(index == 0){
            Node node = new Node(val, dummyNode.next);
            dummyNode.next = node;
            len++;
            return;
        }
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        Node node = new Node(val, cur.next);
        cur.next = node;
        len++;
    }

    public void deleteAtIndex(int index) {
        if(index > len - 1) return;
        Node cur = dummyNode;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        len--;
    }
}
class Node{
    int val;
    Node next;
    public Node(){

    }

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}