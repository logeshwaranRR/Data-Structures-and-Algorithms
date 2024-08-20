package src.main.com.logesh.linkedlist;

public class LL {

    private Node head;
    private Node tail;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    private int size;

    public LL(){
        this.size=0;
    }

    public void addFirst(int value){
        Node newNode = new Node(value);
        newNode.next=head;
        head=newNode;
        if(tail==null){
            tail=newNode;
        }
        size++;

    }
    public void addLast(int value){
        if(tail==null){
            addFirst(value);
            return;
        }
        Node newNode = new Node(value);
        tail.next=newNode;
        tail=newNode;
        size++;
    }

    public void add(int value,int index){
        if(index==0){
            addFirst(value);
            return;
        }
        if(index==size){
            addLast(value);
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node newNode = new Node(value,temp.next);
        temp.next=newNode;
        size++;
    }
    public int deleteFirst(){
        int val= head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        if(size==0){
            return -1;
        }
        int val= tail.value;
        if(size==1){
            head=null;
            tail=null;
            size--;
        }else{
            Node node=getNode(size-2);
            if(node !=null){
                tail=node;
                node.next=null;
                size--;
            }
        }


        return val;
    }

    public Node getNode(int index){
        if(index>=0 && index<size){
            Node temp=head;
            for(int i=1;i<=index;i++){
                temp=temp.next;
            }
            return temp;
        }
         return null;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }
    public class Node{
        private  int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }

    }
}
