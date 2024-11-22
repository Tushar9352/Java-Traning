public class LinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
        static class Queue{
            static Node head = null;
            static Node tail = null;
            public static boolean isEmpty(){
                return head == null && tail == null;
            }
            public static void add(int data){
                Node newNode = new Node(data);
                if(isEmpty()){
                    head = tail = newNode;
                    return;
                }
                tail.next = newNode;
                tail = newNode;
            }
            public static void remove(){
                if(isEmpty()){
                    System.out.println("Queue is empty");
                    return;
                }
                int front = head.data;
                if(tail == head){
                    head = tail = null;
                }else{
                    head = head.next;
                }
            }
            public static int peek(){
                if(isEmpty()){
                    System.out.println("Queue is empty");
                    return -1;
                }
                return head.data;
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
}
