class Node{
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class MyLinkedList {
    public Node head;//保存单链表头结点的引用 默认值Null

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

