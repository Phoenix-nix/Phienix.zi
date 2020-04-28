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

    public void addFrist(int data) {
        Node node = new Node(data);//new实例化一个data，把数据放进去

        if (this.head == null) {//第一次插入节点
            this.head = node;//直接让head指向node
            return;
        }
        node.next = this.head;//如果不是第一次指向，此时的将上次的head指向此结点的node的地址next
        //此数据的地址指向head
        head = node;          //节点指向head
    }

    public void display() {
        Node cur = this.head;
        while(cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
    }

    public static void main(String[] args) {
        TestDemo testDemo = new TestDemo();
        testDemo.addFrist(9);
        testDemo.addFrist(10);
        testDemo.addFrist(11);
        testDemo.addFrist(12);
        testDemo.display();
    }


}
