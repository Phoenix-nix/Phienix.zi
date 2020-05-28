public class TestDemo {

    public  static  void  createCut(Node headA,Node headB) {
        headA.next = headB.next.next;
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(1);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(3);
        myLinkedList.addFirst(4);
        myLinkedList.addFirst(5);
        myLinkedList.addFirst(6);
        myLinkedList.display();

        MyLinkedList myLinkedList2 = new MyLinkedList();
        myLinkedList2.addFirst(10);
        myLinkedList2.addFirst(3);
        myLinkedList2.addFirst(33);
        myLinkedList2.addFirst(42);
        myLinkedList2.addFirst(15);
        myLinkedList2.addFirst(16);
        myLinkedList2.display();
    }
}
