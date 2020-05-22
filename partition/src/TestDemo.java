public class TestDemo {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(1);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(3);
        myLinkedList.addFirst(6);
        myLinkedList.addFirst(4);
        myLinkedList.display();

        myLinkedList.display();
        System.out.println(myLinkedList.FindKthToTail(3).data);
    }
}
