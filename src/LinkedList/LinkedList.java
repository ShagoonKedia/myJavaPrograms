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
            head = tail;
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
 

}
class Main{
    public static void main(String[] args){

        LinkedList list = new LinkedList();
        list.insertFirst(3);
        list.insertFirst(10);
        list.insertFirst(17);
        list.insertFirst(24);


    }
}
