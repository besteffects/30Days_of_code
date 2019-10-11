/*
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backwards and forwards.
Can you determine if a given string,s, is a palindrome?
To solve this challenge, we must first take each character in s, enqueue it in a queue, and also push that same character onto a stack.
Once that's done, we must dequeue the first character from the queue and pop the top character off the stack, then compare the
two characters to see if they are the same; as long as the characters match, we continue dequeueing,
popping, and comparing each character until our containers are empty (a non-match means s isn't a palindrome).
 */

package queuesAndStacksImpl;

import java.util.*;

public class QueuesAndStacks {
    // Write your code here.
    Stack<Character> stack = new Stack<>();
    Queue<Character> queue = new LinkedList<>();

    private void pushCharacter(char character ) {
         stack.push(character);
    }
    private void enqueueCharacter(char character) {
        queue.add(character);
    }

    char popCharacter() {
        return stack.pop();
    }
    private char dequeueCharacter() {
        return queue.remove();
    }
//end of task code

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        QueuesAndStacks p = new QueuesAndStacks();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }




}