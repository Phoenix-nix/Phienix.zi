class Node{
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MylinkedList {
    public Node head;//保存单链表头结点的引用 默认值Null

    //删除所有出现关键字为key的节点
    public void removeAllKey(int key) {
        Node prev = this.head;
        Node cur = this.head.next;//代表要删除的节点
        while(cur != null) {
            if(cur.data == key) {
                prev.next = cur.next;
                cur = cur.next;
            } else {
                prev = cur;
                cur = cur.next;
            }
        }
        if(this.head.data == key) {
            this.head = this.head.next;
        }
    }

    //任意位置插入，第一个数据节点为0号下标
    public void addIndex(int index,int data) {

        if(index == 0) {
            addFrist(data);
            return;
        }
        if(index >= this.size()) {
            addLast(data);
            return;
        }
        Node node = new Node(data);//先找到index前一个节点的地址
        Node cuu = searchIndex(index);//进行插入
        node.next = cuu.next;
        cuu.next = node;

    }
    private  Node searchIndex(int index) {
        Node node = new Node(index);
        if(index<0 || index >this.size()) {
            throw  new RuntimeException("index位置不合法！");
        }
        Node cuu = this.head;//index-1
        while(index-1 != 0) {
            cuu = cuu.next;
            index--;
        }
        return cuu;
    }

    //得到单链表的长度
    public int size() {
        int count = 0;
        Node cuu = this.head;

        while (cuu != null) {
            count++;
            cuu = cuu.next;
        }
        return count;
    }

    //查找是否包含关键字key是否在单链表中
    public boolean contains(int key) {
        Node cuu = this.head;

        while(cuu != null) {
            if(cuu.data == key){
                return true;
            }
            cuu = cuu.next;
        }
        return false;
    }

    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        Node cuu = this.head;
        if(this.head == null) {
            this.head = node;
            return;
        }
        while (cuu.next != null) {
            cuu = cuu.next;
        }
        cuu.next = node;
    }

    //头插法
    public void addFrist(int data) {
        Node node = new Node(data);//new实例化一个data，把数据放进去

        if(this.head == null) {//第一次插入节点
            this.head = node;//直接让head指向node
            return;
        }
        node.next = this.head;//如果不是第一次指向，此时的将上次的head指向此结点的node的地址next
        //此数据的地址指向head
        head = node;          //节点指向head
    }

    //打印单链表
    public void display() {
        Node cur = this.head;
        while(cur != null) {
            System.out.println(cur.data + " ");
            cur = cur.next;
        }
    }

}



