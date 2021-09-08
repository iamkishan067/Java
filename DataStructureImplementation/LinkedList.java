/*
 * This is data Structure implementation of Linked List with array.
 *
 * --> It can be used as list, queue, stack,etc
 * --> It allows null entry.
 * --> Here the memory allocation is dynamic.
 * --> It is not synchronized
 * --> It can have duplicate items.
 * --> Here manipulation is fast because we don't have to do shifting.
 * 
 */

public class LinkedList{
    public static void main(String[] args){
        LinkedListImpl l1 = new LinkedListImpl();
        l1.insertFirst(10);
        l1.insertLast(20);
        l1.insertFirst(30);
        l1.insertLast(40);
        l1.insertFirst(50);
        System.out.println("The size of Linkled List : " + l1.size);
        
        System.out.println("--------------------");
        l1.insertNth(60, 5);
        // l1.deleteLast();
        // l1.deleteLast();
        // l1.deleteNth(6);
        
        l1.printLL();
        
        System.out.println("--------------------");
        System.out.println("The size of Linkled List : " + l1.size);
        System.out.println("--------------------");
        l1.findElement(60); 
        
    }
}

class Node{
    public int item;
    public Node next;
}

class LinkedListImpl{
    
    Node head;
    int size;
    
    public LinkedListImpl(){
        this.head = null;
        this.size = 0;
    }
    
    
    public void insertFirst(int item){
        Node node = new Node();
        node.item = item;
        node.next = this.head;
        this.head = node;
        this.size += 1;
    }
    
    public void insertLast(int item){
        Node node = new Node();
        node.item = item;
        node.next = null;
        size++;
        
        if(head == null){
            head.next = node;
        }else{
            Node current = this.head;
            while(current.next != null){
                current = current.next; 
            }
            current.next = node;
        }
    }
    
    public void insertNth(int item, int pos){
        Node node = new Node();
        node.item = item;
        Node current = this.head;
        if(this.head != null && pos <= this.size){
            for(int i = 1; i < pos - 1; i++){
                current = current.next;
            }
            node.next = current.next;
            current.next = node;
            this.size++;
        }else{
            System.out.println("Exceeded the current linkedlist size. Current Size : " + this.size);
        }
    }
    
    public void deleteFirst(){
        if(head != null){
            this.head = this.head.next;
            this.size--;
            System.out.println("Successfully deleted first element: " + this.head.item);
        }else{
            System.out.println("LinkedList is empty.");
        }
    }
    
    public void deleteLast(){
       if(head != null){
            Node current = this.head;
            while(current.next != null){
                current = current.next;
            }
            
            current = null;
            this.size--;
       }else{
           System.out.println("Linked List is empty.");
       }
    }
    
    
    public void deleteNth(int pos){
        if(head != null && pos <= size){
            Node current = this.head;
            for(int i = 1; i < pos - 1; i++){
                current = current.next;
            }
            Node deletedNode = current.next;
            current.next = current.next.next;
            this.size--;
            
            System.out.println("Successfully deleted " + pos + "th element: " + deletedNode.item);
            
        }else{
            System.out.println("Exceeded current Linked list size. Current size : " + this.size);
        }
    }
    
    public void findElement(int item){
        Node current = this.head;
        boolean found = false;
        for(int i = 0; i < size; i++){
            if(current.item == item){
                System.out.println("Item "+ item + " was found at " + i + "th position");
                found = true;
                break;
            }
            current = current.next;
        }
        
        if(!found){
            System.out.println("Item " + item + " was not found");
        }
        
        
    }
    
    
    public void printLL(){
        Node current = this.head;
        
        for(int i = 0; i < size; i++){
            System.out.println("Node " + current.item + " is at location : " + i);
            current = current.next;
        }

    }
    
    
}


/*
OUTPUT : 

The size of Linkled List : 5
--------------------
Node 50 is at location : 0
Node 30 is at location : 1
Node 10 is at location : 2
Node 20 is at location : 3
Node 60 is at location : 4
Node 40 is at location : 5
--------------------
The size of Linkled List : 6
--------------------
Item 60 was found at 4th position

*/
