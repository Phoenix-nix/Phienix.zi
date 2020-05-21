public class TestDemo {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(1);
        myLinkedList.addFirst(1);
        myLinkedList.addFirst(1);
        myLinkedList.addFirst(1);
        myLinkedList.addFirst(4);
        myLinkedList.display();
        //myLinkedList.remove(4);
        //myLinkedList.display();
        //myLinkedList.remove(1);
        //myLinkedList.display();
        myLinkedList.removeAllKey(1);
        myLinkedList.display();
        System.out.println(myLinkedList.contains(4));
        System.out.println(myLinkedList.size());
    }
}
