public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFrist(10);
        myLinkedList.addFrist(11);
        myLinkedList.addFrist(12);
        myLinkedList.addFrist(13);
        myLinkedList.display();
        System.out.println(myLinkedList.contains(11));
    }
}