import java.util.ArrayList;
public class StackA {
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.isEmpty();
        }
        public static void push(int data){
            list.add(data);
        }
        public static int pop(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }
            int data = list.get(list.size()-1);
            list.remove(list.size()-1);
            return data;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}