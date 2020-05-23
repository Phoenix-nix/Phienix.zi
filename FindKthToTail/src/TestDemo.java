public class TestDemo {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(12);
        myLinkedList.addFirst(11);
        myLinkedList.addFirst(13);
        myLinkedList.addFirst(14);
        myLinkedList.addFirst(15);
        myLinkedList.display();

        System.out.println(myLinkedList.FindKthToTail(3).data);

    }
}

