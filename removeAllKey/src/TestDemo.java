public class TestDemo {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(1);
        myLinkedList.addFirst(1);
        myLinkedList.addFirst(4);
        myLinkedList.addFirst(1);
        myLinkedList.addFirst(1);
        myLinkedList.addFirst(4);
        myLinkedList.display();
        myLinkedList.removeAllKey(4);
        myLinkedList.display();

    }
}
