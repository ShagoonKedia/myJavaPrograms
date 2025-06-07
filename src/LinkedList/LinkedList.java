package LinkedList;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public LinkedList(){
        this.size = 0;
    }

    class Node{
        private int value;
        private Node next;
    

        public Node(int value){

            this.value = value;

        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public void addFirst(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;

        if(head == null){
            head = newNode;
            tail = newNode;
        }
    }

    public void addLast(int val){
        if(tail == null){
            addFirst(val);
            return;
        }
        Node newNode = new Node(val);
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void insert(int val, int index){
        if(index == 0){
            addFirst(val);
            return;
        }
        if(index == size){
            addLast(val);
            return;
        }

        Node temp = head;
        for(int i = 1; i < index; i++){
            temp=temp.next;
        } 
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.print("NULL");
        System.out.println();
    }
    

}
