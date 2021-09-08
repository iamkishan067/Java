/*
 * This is data Structure implementation of Stack.
 * Here data is inserted on the top and popped in LIFO manner.
 * All the operations like push, pop, peek, isEmpty, isFull are of time complexity O(log(1)).
 */

public class Stack{
    public static void main(String[] args){
        StackImpl s1 = new StackImpl(5);
        System.out.println(s1.isEmpty());
        System.out.println(s1.isFull());
        s1.pop();
        
        System.out.println("-----------------------");
        
        s1.push(100);
        s1.push(200);
        s1.push(300);
        s1.push(400);
        s1.push(500);
        
        System.out.println("-----------------------");
        
        s1.pop();
        System.out.println(s1.peek());
        s1.pop();
        
        System.out.println(s1.isEmpty());
        System.out.println(s1.isFull());
    }
}

class StackImpl{
    int size;
        int arr[];
        int top;
        
        public StackImpl(int size){
            this.size = size;
            this.arr = new int[size];
            this.top = -1;
        }
        
        public void push(int element){
            if(!isFull()){
                top++;
                arr[top] = element;
                System.out.println("Pushed element : " + element);
            }else{
                System.out.println("Stack is full");
            }
        }
        
        public int pop(){
            if(!isEmpty()){
                System.out.println("Popped element is : " + arr[top]);
                return arr[top--];
            }else{
                System.out.println("Stack is empty");
                return - 1;
            }
        }
        
        public int peek(){
            if(!isEmpty()){
                System.out.println("Peeked element is : " + arr[top]);
                return arr[top];
            }else{
                System.out.println("Stack is empty");
                return - 1;
            }
        }
        
        public boolean isEmpty(){
            return (top == -1);
        }
        
        public boolean isFull(){
            return (size - 1 == top);
        }
}

/*
OUTPUT : 

true
false
Stack is empty
-----------------------
Pushed element : 100
Pushed element : 200
Pushed element : 300
Pushed element : 400
Pushed element : 500
-----------------------
Popped element is : 500
Peeked element is : 400
400
Popped element is : 400
false
false

*/
