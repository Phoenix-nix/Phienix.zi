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


    //将两个升序链表合并为一个新的升序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的
    public Node mergeTwoLists(Node headA,Node headB) {
        Node newHead = new Node(-1);
        Node tmp = newHead;
        while(headA !=null && headB != null) {
            if(headA.data < headB.data) {
                tmp.next = headA;
                headA= headA.next;
                tmp = tmp.next;
            }else {
                tmp.next = headB;
                headB = headB.next;
                tmp = tmp.next;
            }
        }
        if(headA != null) {
            tmp.next = headA;
        }
        if(headB !=null) {
            tmp.next = headB;
        }
        return newHead.next;
    }

    //编写一个程序，找到两个单链表相交的起始节点
    public static Node getIntersectionNode(Node headA,Node headB) {
        //1.求长度,走差值步
        int lenA = 0;
        int lenB = 0;
        Node pl = headA;
        Node ps = headB;
        while(pl != null) {
            lenA++;
            pl = pl.next;
        }
        while(ps != null) {
            lenB++;
            ps = ps.next;
        }
        pl = headA;
        ps = headB;
        int len = lenA-lenB;
        if(len < 0) {
            pl = headB;
            ps = headA;
            len = lenB - lenA;
        }
        //一定是pl指向最长的单链表
        for (int i = 0; i < len; i++) {
            pl = pl.next;
        }
        //2.ps pl一定是在同一个起跑线上
        while(ps != pl && pl != null && ps != null) {
            ps = ps.next;
            pl = pl.next;
        }
        if(pl == ps && pl !=null) {
            return pl;
        }
        return null;
    }
}