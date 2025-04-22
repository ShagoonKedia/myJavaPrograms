package LinkedList;

public class LL {

    Node head;
    private int size;

    LL(){
        this.size = 0;
    }
    class Node{

        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }

    }

    // add -> addFirst, addLast
    public void addFirst(String data){
        Node newNode = new Node(data);

        if(head == null){    // if ll is empty, add new node to ll
            head = newNode;
            return;
        }

        newNode.next = head;  // point new node's next to head 
        head = newNode;       // make new node as head to add a node at forst of a ll
    }

    public void addLast(String data){
        Node newNode = new Node(data);

        if(head == null){    // if ll is empty, add new node to ll
            head = newNode;
            return;
        }

        Node curNode = head;   // a pointer to traverse the ll

        while(curNode.next != null){    //until we reach the end of ll
            curNode = curNode.next; 
        }

        curNode.next = newNode;
    }

    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node curNode = head;   // a pointer to traverse the ll

        while(curNode.next != null){   //until we reach the end of ll
            
            System.out.print(curNode.data+ "->");
            curNode = curNode.next; 
        }
        System.out.print("NULL");
        System.out.println();
    }


    // delete
    public void deleteFirst(){
        
        if(head == null){
            System.out.println(("list is empty"));
            return;
        }

        size--;

        head = head.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println(("list is empty"));
            return;
        }
        
        size--;
        if(head.next == null){  // when only one element is present in the list, make head as null
            head = null;
            return;
        }

        Node secondLast = head; // pointer for traversal
        Node lastNode = head.next;

        while(lastNode.next != null){  // traversing the list
            lastNode.next = lastNode;
            secondLast.next = secondLast;
        }

        secondLast.next = null;  // point second last node's next as null to delete last element from list 
    }

    public int getSize(){
        return size;

    }




    public static void main(String[] args) {
        LL list = new LL();
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
