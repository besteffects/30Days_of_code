package queuesAndStacksImpl;

import java.util.LinkedList;

public class QueueyImpl {
    LinkedList queue;

    //Making a queue instance
    public QueueyImpl(){
        queue=new LinkedList();
    }

    //Is our queue empty?
 public boolean isEmpty() {
     return queue.isEmpty();
 }
 //What is the size of our queue?
     public int size(){
         return queue.size();
     }

     //Enqueueing an item
     public void enque(int n){
        queue.addLast(n);
     }
//Peek at the first item
     public int peek(){
       return (int)queue.get(0);
     }

     //Dequeueing an item
     public int dequeue(){
        return (int)queue.remove(0);
     }

    public static void main(String[] args) {
   QueueyImpl numberqueue =new QueueyImpl();
   numberqueue.enque(5);
   numberqueue.enque(7);
   numberqueue.enque(6);
        System.out.println("First out: " + numberqueue.dequeue());
        System.out.println("Second out: " + numberqueue.dequeue());
        System.out.println("Second out: " + numberqueue.dequeue());
    }
}
