import java.util.*;
public class TwoStack {
    static class Queue{
        static Stack<Integer> stack1 = new Stack<>();
        static Stack<Integer> stack2 = new Stack<>();
        public static boolean isEmpty(){
            return stack1.isEmpty() && stack2.isEmpty();
        }
        public static void add(int data){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            stack1.push(data);
            while(!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
        }
        public static void remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return;
            }
            stack1.pop();
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return stack1.peek();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        Queue.add(1);
        Queue.add(2);
        Queue.add(3);
        while (!Queue.isEmpty()) {
            System.out.println(Queue.peek());
            Queue.remove();
        }
    }
}
