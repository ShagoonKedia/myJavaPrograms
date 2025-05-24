package LinkedList;

// OUTER CLASS - The LinkedList container
public class LL {

    // INSTANCE VARIABLES (Fields of the LL class)
    
    Node head;           // Reference to the first node in the linked list
    private int size;    // Keeps track of how many elements are in the list
    
    /*
     * WHY THESE VARIABLES?
     * - head: Without this reference, we'd lose access to our entire list!
     *         It's like the "entrance door" to our linked list.
     * - size: Allows us to quickly know list length without counting every time
     */

    // CONSTRUCTOR - Called when we create a new LL object
    LL(){
        this.size = 0;   // Initialize with zero elements
        // Note: head is automatically null (default for object references)
    }
    
    /*
     * CONSTRUCTOR EXPLANATION:
     * - When you write: LL list = new LL();
     * - This constructor runs and sets up an empty linked list
     * - No parameters needed - we're creating an empty list
     */

    // INNER CLASS - Node represents individual elements
    class Node{
        
        // NODE INSTANCE VARIABLES
        String data;     // The actual data this node stores
        Node next;       // Reference pointing to the next node in the chain
        
        /*
         * WHY String data?
         * - Your implementation is specifically for String data
         * - Could be made generic with <T> for any data type
         * 
         * WHY Node next?
         * - This creates the "link" in our linked list
         * - Each node points to the next one, forming a chain
         * - Last node will have next = null (end of chain)
         */

        // NODE CONSTRUCTOR - Called when creating a new node
        Node(String data){
            this.data = data;    // Store the provided data
            this.next = null;    // Initially, this node doesn't point anywhere
            size++;              // Increment the outer class's size counter
        }
        
        /*
         * CONSTRUCTOR PARAMETERS:
         * - Takes String data: the value to store in this node
         * - Automatically sets next to null (safe default)
         * - Increments size: tracks total nodes in the list
         */
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
