class Node{
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class TestDemo {
    public Node head;//保存单链表头结点的引用 默认值Null

    public int size() {
        int count = 0;
        Node cuu = this.head;

        while (cuu != null) {
            count++;
            cuu = cuu.next;
        }
        return count;
    }

    public void addLast(int data) {
        Node node = new Node(data);
        Node cuu = this.head;
        if (this.head == null) {
            this.head = node;
            return;
        }
        while (cuu.next != null) {
            cuu = cuu.next;
        }
        cuu.next = node;
    }

    public void display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
    }


    public static void main(String[] args) {
        TestDemo testDemo = new TestDemo();
        testDemo.addLast(9);
        testDemo.addLast(10);
        testDemo.addLast(11);
        testDemo.addLast(12);
        testDemo.display();
        System.out.println();
        System.out.println(testDemo.size());
    }
}