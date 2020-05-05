public class TestDemo {
    public static void main(String[] args) {
        MylinkedList myLinkedList = new MylinkedList();
        myLinkedList.addFrist(12);
        myLinkedList.addFrist(11);
        myLinkedList.addFrist(12);
        myLinkedList.addFrist(12);
        myLinkedList.addFrist(12);
        myLinkedList.display();
        System.out.println(" ");
        myLinkedList.removeAllKey(12);
        myLinkedList.display();

    }
}