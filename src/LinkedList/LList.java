package LinkedList;

public class LList {

    Node head;
    private int size;

    LList(){  // constructor - called when we create a new object
        this.size = 0;
    }

    class Node{  
        String data;
        Node next;

        Node(String data){    // Node constructor, called when creating a new Node
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(String data){  //Time complexity - O(1)

        Node newNode = new Node(data);

        if(head == null){  // If the list is empty

            head = newNode;
            return;

        }
        newNode.next = head;  // Link new Node to current head
        head = newNode;       //Point new Node as head
    }

    public void addLast(String data){  //Time complexity - O(n)
        
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }
        
        Node curNode = head;
        while(curNode.next != null){ // Traverse the whole list to reach the end of the list
            curNode = curNode.next;
        }
        curNode.next = newNode;      // add new element to the end of the list

    }

    public void printList(){
        
        if(head == null){
            System.out.println("list is empty");
        }
        Node curNode = head;
        while(curNode != null){
            System.out.print(curNode.data + "->");
            curNode = curNode.next;
        }
        System.out.print("NULL");
        System.out.println();
        

    }
    public void deleteFirst(){
        if(head == null){
            return;
        }
        size--;
        head = head.next;  // Simply move head to next node
    }
    public void deleteLast(){
        Node secondLast = head;
        while(secondLast.next.next != null){
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public int getSize(){
        return size;
    }

    public static void main(String[] args){
        LList list = new LList();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("Node");
        list.printList();

        list.addFirst("This");
        list.printList();
        
        list.deleteFirst();
        list.printList();

        System.out.println(list.getSize());

    }

}
