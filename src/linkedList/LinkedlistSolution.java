package linkedList;

/*
A Node class is provided for you in the editor. A Node object has an integer data field, data ,and a Node instance pointer, next
, pointing to another node (i.e.: the next node in a list).
A Node insert function is also declared in your editor. It has two parameters: a pointer, head
, pointing to the first node of a linked list, and an integer data
value that must be added to the end of the list as a new Node object.

Task
Complete the insert function in your editor so that it creates a new Node (pass data
as the Node constructor argument) and inserts it at the tail of the linked list referenced by the head
parameter. Once the new node is added, return the reference to the head node.
Note: If the head argument passed to the insert function is null, then the initial list is empty.

Input Format
The insert function has 2 parameters: a pointer to a Node named head, and an integer value, data.
The constructor for Node has 1 parameter: an integer value for the data field.

You do not need to read anything from stdin.

Output Format
Your insert function should return a reference to the head node of the linked list.
 */
import java.util.*;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

class LinkedListSolution {

    public static  Node insert(Node head,int data) {
        //Complete this method
            if(head == null)
                return new Node(data);

            if(head.next == null){
                head.next = new Node(data);
            }
            else{
                insert(head.next,data);
            }

            return head;
        }

    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}