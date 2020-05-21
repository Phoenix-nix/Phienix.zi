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

    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        if(this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.next = node;
            node.prev = this.tail;
            this.tail = node;
        }
    }

     //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        Node cur = this.head;
        while(cur != null) {
            if(cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //得到单链表的长度
    public int size() {
        int count = 0;
        Node cur = this.head;
        while(cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }


    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index,int data) {
        return false;
    }

    //删除第一次出现关键字为key的节点
    private Node searchPrev(int key) {//找到key
        Node prev = this.head;
        while(prev.next != null) {
            if(prev.next.data ==key) {
                 return prev;
            }else {
                 prev = prev.next;
             }
        }
        return null;//没有这个数时，返回
    }
    public void remove(int key) {
        if(this.head == null) {
            return;
        }
        if(this.head.data == key) {
            this.head = this.head.next;
            return;
        }
        Node prev = searchPrev(key);
        if(prev == null) {
            System.out.println("根本没有这个结点！");
        }
        Node del = prev.next;
        prev.next = del.next;
    }

    //删除所有值为key的节点
     public void removeAllKey(int key) {
        Node prev = this.head;//从头结点开始遍历
        Node cur = this.head.next;//cur是key。要找的值，从第二个开始
        while(cur != null) {//要删除所有就要循环
            if(cur.data == key) {//如果当前的cur就是要删的值
                prev.next = cur.next;//此时是值指向要删的值得next，就删除
                cur = cur.next;//cur指向下一个值继续
            }else {//如果当前的cur不是要删的值
                prev = cur;//此时的值是cur（保留）
                cur = cur.next;//cur指向下一个值继续
            }
        }
        if(this.head.data ==key ){//如果头结点是key，删掉头结点
            this.head = this.head.next;
        }
     }

    /**
     * JVM在回收内存的时候，当该对象没有人在引用他的时候，这个对象才会被回收
     *
     */
    //clear释放内存
    public void clear(){
        this.head = null;//或者每一个数都指向null
    }

    public Node middleNode() {
        Node fast = this.head;
        Node slow = this.head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

}
