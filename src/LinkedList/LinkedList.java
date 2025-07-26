package LinkedList;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public LinkedList(){
        this.size = 0;
    }

    private class Node{

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

    public void insertFirst(int val){

        Node node = new Node(val);

        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size++;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.print("END");
    }

    public void addLast(int val){

        Node node = new Node(val);
        if(head == null){
            insertFirst(val);
            return;
        }
        Node temp = head;
        while(temp != null){
            temp.next = temp.next;
        }
        temp.next = node;
        size++;

    }
    public void insertRandom(int val, int index){

        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            addLast(val);
            return;
        }
        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;

        }
        Node node = new Node(val, temp.next); // using the constructor where we need to pass val and node
        temp.next = node;
        size++;

    }
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;

    }
    public int deleteLast(){

        if(head == null){
            System.out.println("List is empty");
            return -1;
        }
        if(head.next == null){ // if only one element is present
            head = null;
        }
        
        Node secondLast = head;
        Node last = head.next;
        while(last.next != null){
            last = last.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
        size--;

        int val = last.value;
        return val;
        
    }
    
 

}
class Main{
    public static void main(String[] args){

        LinkedList list = new LinkedList();
        list.insertFirst(3);
        list.insertFirst(10);
        list.insertFirst(17);
        list.insertFirst(24);

        list.display();


    }
}
