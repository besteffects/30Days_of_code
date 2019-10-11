package scope;

import java.util.*;


class Difference {
    public int maximumDifference;
    private int[] elements;

    // Add your code here
    Difference(int[] elements) {
        this.elements = elements;
        ;
    }

    //    This is correct answer
//    public void computeDifference() {
//        int max=1, min=100;
//        for (int e: elements) {
//            max = Math.max(max, e);
//            min = Math.min(min, e);
//        }
//        maximumDifference = max - min;
//    }

    //This solution works only when main is in a different class
    void computeDifference() {
        Arrays.sort(elements);
        maximumDifference = elements[elements.length - 1] - elements[0];
    }

} // End of Difference class

