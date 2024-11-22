import java.util.*;

public class RemoveCycle {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static Node size;

    public boolean checkPalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        Node midNode = findMid(head);
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev = curr;
            curr =next;
        }
        Node right =prev;
        Node left =head;
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left= left.next;
            right= right.next;
        }
        return true;
    }

    public Node findMid(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void removeCycle(){
        Node slow = head, fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) { // Cycle detected
                cycle = true;
                break;
            }
        }
        if(cycle==false){
            return;
        }
        slow = head;
        Node prev = null;
        while(slow!=fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }


    public static void main(String[] args) {
        head =new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head.next;
        System.out.println("Before removing cycle");
        removeCycle();
        System.out.println("After removing cycle");
        // prints the linked list


    }
}
