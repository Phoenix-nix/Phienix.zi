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
        if(this.head == null) {
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
        Node cur= this.head;
        while(cur != null) {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    //输入一个链表，输出该链表中倒数第k个结点
    public Node FindKthToTail(int k) {
        if(k < 0 ) {//当k不合法时
            System.out.println("k不合法");
            return null;//返回空
        }
        Node fast = this.head;//一个快指针
        Node slow = this.head;//一个慢指针
        while(k-1 > 0) {//当要找的结点不是第一个结点时
            if(fast.next != null) {//为空时说明没有这个数，跳出
                fast = fast.next;
                k--;
            }else {
                System.out.println("没有这个节点！");//跳出输出没有这个节点
                return null;
            }
            fast = fast.next;//一直往下走
            k--;
        }
        while(fast.next != null) {//当不为空时
            fast = fast.next;//一直往下走
            slow = slow.next;//一直往下走
        }
        return slow;
    }
}
