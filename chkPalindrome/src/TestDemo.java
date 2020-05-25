public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(11);
        myLinkedList.addFirst(12);
        myLinkedList.addFirst(13);
        myLinkedList.addFirst(12);
        myLinkedList.addFirst(11);
        myLinkedList.display();
        System.out.println(myLinkedList.chkPalindrome());
    }
}
