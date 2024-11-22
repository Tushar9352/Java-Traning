import java.util.*;

public class Floyd {
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

    public static void main(String[] args) {
        Floyd list = new Floyd();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(2);
        list.head.next.next.next = new Node(1);

        System.out.println("Is palindrome : " + list.checkPalindrome());
    }
}
