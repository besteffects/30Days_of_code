//Complete this code or write your own from scratch
import javafx.scene.control.Tab;

import java.util.*;
import java.io.*;

class DictionariesAndMaps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //n - number of names and phone numbers
        Map<String, Integer> myMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            myMap.put(name, phone);
        }

        while (in.hasNext()) {
            String s = in.next();
            if (myMap.containsKey(s)) {
                System.out.println(s + "=" + myMap.get(s)); //s is our input, myMap.get(s) - the value of our input
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
