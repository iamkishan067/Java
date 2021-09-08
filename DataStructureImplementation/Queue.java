/*
 * This is data Structure implementation of Queue using array.
 * Here data is inserted on the top and popped in FIFO manner.
 * Enqueue --> to insert the element from rear side
 * Dequeue --> to remove the element from front side
 * All the operations like push, pop, peek, isEmpty, isFull are of time complexity O(log(1)).
 */



public class Queue{
    int capacity;
    int arr[];
    int front;
    int rear;
    int size;
    
    public Queue(int size){
        this.size = size;
        arr = new int[size];
        front = 0;
        rear = - 1;
        capacity = 0;
    }
    
    public void enqueue(int element){
        if(isFull()){
           System.out.println("Queue is full, cannot enqueue anymore"); 
        }else{
            if(rear == size - 1){
                rear = 0;
            }else{
               rear++; 
            }
            arr[rear] = element;
            capacity++;
            System.out.println("Inserted element : " + element);
        }
    }
    
    public int dequeue() {
        if(isEmpty()){
            System.out.println("Queue is empty, cannot dequeue element.");
            return -1;
        }else{
            if(front == size - 1){
              int returnEle = arr[front];
              System.out.println("Dequeued element is : " + returnEle);
              front = 0;
              capacity--;
              return returnEle;
            }else{
                int returnEle = arr[front];
                System.out.println("Dequeued element is : " + returnEle);
                front ++;
                capacity--;
                return returnEle;
            }
        }
    }
    
    public boolean isEmpty(){
        return (capacity == 0);
    }
    
    public boolean isFull(){
        return (capacity == size);
    }
    
    public static void main(String[] args){
        Queue q1 = new Queue(5);
        System.out.println(q1.isFull());
        System.out.println(q1.isEmpty());
        
        System.out.println("--------------------");
        
        q1.enqueue(10);
        q1.enqueue(20);
        q1.dequeue();
        
        q1.enqueue(30);
        q1.enqueue(40);
        q1.enqueue(50);
        q1.enqueue(60);
        q1.dequeue();
        q1.dequeue();
        q1.dequeue();
        q1.dequeue();
        q1.dequeue();
        q1.dequeue();
        q1.enqueue(30);
        q1.enqueue(40);
        q1.enqueue(50);
        q1.enqueue(60);
        q1.enqueue(30);
        q1.enqueue(40);
        q1.enqueue(50);
        q1.enqueue(60);
        q1.dequeue();
        
    }
    
    
}

/*

OUTPUT :

false
true
--------------------
Inserted element : 10
Inserted element : 20
Dequeued element is : 10
Inserted element : 30
Inserted element : 40
Inserted element : 50
Inserted element : 60
Dequeued element is : 20
Dequeued element is : 30
Dequeued element is : 40
Dequeued element is : 50
Dequeued element is : 60
Queue is empty, cannot dequeue element.
Inserted element : 30
Inserted element : 40
Inserted element : 50
Inserted element : 60
Inserted element : 30
Queue is full, cannot enqueue anymore
Queue is full, cannot enqueue anymore
Queue is full, cannot enqueue anymore
Dequeued element is : 30

*/

