package QueuesAndStacksImpl;

import LinkedListImpl.LinkedList;

public class Queuey {
    LinkedList queue;

    //Making a queue instance
    public Queuey(){
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
        queue.add(n);
     }

     //Dequeueing an item
//     public int dequeue(){
//        return (int) queue.remove(0);
//     }

    public static void main(String[] args) {
    }
}
