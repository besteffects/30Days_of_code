package LinkedListImpl;

public class LinkedList {
    //Properties
    Node head;
    int count;
    //Constructors
    public LinkedList(){
        head=null;
        count=0;
    }
    public LinkedList(Node newHead){
        head=newHead;
        count=1;
    }

    //Methods

    public static void main(String[] args) {

    }

    //add
public void add(int newData){
        Node temp= new Node(newData);
        Node current = head;
        while(current.getNext() !=null){
            current = current.getNext();
        }
        current.setNext(temp);
        count++;
}

    //get
public int get(int index){
        if (index<=0){
            return -1;
        }
        Node current=head;
        for (int i=0;i<index;i++){
            current=current.getNext();
        }
        return current.getData();
}

    //size
public int size(){
        return count;
}
    //remove
public void remove(){
      //remove fromm the back of the list
    Node current =head;
    while (current.getNext().getNext()!=null){
       current=current.getNext();
    }
    current.setNext(null);
    count--;
}

    //isEmpty
public boolean isEmpty() {
        return head==null;
}
}
