class Node {
    public int data;//数据
    public Node next;//后继信息
    public Node prev;//前驱信息

    public Node(int data) {
        this.data = data;
    }
}
public class MyLinkedList {
    public Node head;//双向链表标志的头
    public Node tail;//双向链表的尾巴

    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
        }
    }

    //打印双链表
    public void display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //删除所有值为key的节点
    public void removeAllKey(int key) {
        Node prev = this.head;//从头结点开始遍历
        Node cur = this.head.next;//cur是key。要找的值，从第二个开始
        while (cur != null) {//要删除所有就要循环
            if (cur.data == key) {//如果当前的cur就是要删的值
                prev.next = cur.next;//此时是值指向要删的值得next，就删除
                cur = cur.next;//cur指向下一个值继续
            } else {//如果当前的cur不是要删的值
                prev = cur;//此时的值是cur（保留）
                cur = cur.next;//cur指向下一个值继续
            }
        }
        if (this.head.data == key) {//如果头结点是key，删掉头结点
            this.head = this.head.next;
        }
    }
}