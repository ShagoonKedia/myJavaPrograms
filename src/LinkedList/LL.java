package LinkedList;

public class LL {

    Node head;
    class Node{

        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
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




    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("Node");
        list.printList();

        list.addFirst("This");
        list.printList();
        
    }

}
