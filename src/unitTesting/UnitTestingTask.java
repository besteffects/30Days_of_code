/*
This problem is all about unit testing.
Your company needs a function that meets the following requirements:
- For a given array of n integers, the function returns the index of the element with the minimum value
 in the array. If there is more than one element with the minimum value, the returned index should be
 the smallest one.
- If an empty array is passed to the function, it should raise an Exception.
Note: The arrays are indexed from 0.
A colleague has written that function, and your task is to design 3 separated unit tests,
testing if the function behaves correctly.

Another co-worker has prepared functions that will perform the testing and validate returned results
with expectations. Your task is to implement 3 classes that will produce test data and the expected results
for the testing functions. More specifically: function get_array() in TestDataEmptyArray class and
functions get_array() and get_expected_result() in classes TestDataUniqueValues and
TestDataExactlyTwoDifferentMinimums following the below specifications:
    -1 get_array() method in class TestDataEmptyArray has to return an empty array.
    -2 get_array() method in class TestDataUniqueValues has to return an array of size at least 2 with
    all unique elements, while method get_expected_result() of this class has to return the expected
    minimum value index for this array.
    -3 get_array() method in class TestDataExactlyTwoDifferentMinimums has to return an array where
    there are exactly two different minimum values, while method get_expected_result() of this
    class has to return the expected minimum value index for this array.
Take a look at the code template to see the exact implementation of functions that your colleagues already implemented.
 */
package unitTesting;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class UnitTestingTask {

    public static int minimum_index(int[] seq) {
        if (seq.length == 0) {
            throw new IllegalArgumentException("Cannot get the minimum value index from an empty sequence");
        }
        int min_idx = 0;
        for (int i = 1; i < seq.length; ++i) {
            if (seq[i] < seq[min_idx]) {
                min_idx = i;
            }
        }
        return min_idx;
    }

    static class TestDataEmptyArray {
        public static int[] get_array() {
            // complete this function
            int[] array = {};
            return array;
        }
    }

    static class TestDataUniqueValues {
        static int[] array = {1, 2, 3, 4};

        public static int[] get_array() {
            // complete this function
            return array;
        }

        public static int get_expected_result() {
            // complete this function
            return 0;
        }
    }

    static class TestDataExactlyTwoDifferentMinimums {
        static int[]array={1,1,2,3,4};
        public static int[] get_array() {
            // complete this function
            return array;
        }

        public static int get_expected_result() {
            // complete this function
            return 0;
        }
    }

    public static void TestWithEmptyArray() {
        try {
            int[] seq = TestDataEmptyArray.get_array();
            int result = minimum_index(seq);
        } catch (IllegalArgumentException e) {
            return;
        }
        throw new AssertionError("Exception wasn't thrown as expected");
    }

    public static void TestWithUniqueValues() {
        int[] seq = TestDataUniqueValues.get_array();
        if (seq.length < 2) {
            throw new AssertionError("less than 2 elements in the array");
        }

        Integer[] tmp = new Integer[seq.length];
        for (int i = 0; i < seq.length; ++i) {
            tmp[i] = Integer.valueOf(seq[i]);
        }
        if (!( ( new LinkedHashSet<Integer>(Arrays.asList(tmp)) ).size() == seq.length )) {
            throw new AssertionError("not all values are unique");
        }

        int expected_result = TestDataUniqueValues.get_expected_result();
        int result = minimum_index(seq);
        if (result != expected_result) {
            throw new AssertionError("result is different than the expected result");
        }
    }

    public static void TestWithExactlyTwoDifferentMinimums() {
        int[] seq = TestDataExactlyTwoDifferentMinimums.get_array();
        if (seq.length < 2) {
            throw new AssertionError("less than 2 elements in the array");
        }

        int[] tmp = seq.clone();
        Arrays.sort(tmp);
        if (!( tmp[0] == tmp[1] && ( tmp.length == 2 || tmp[1] < tmp[2] ) )) {
            throw new AssertionError("there are not exactly two minimums in the array");
        }

        int expected_result = TestDataExactlyTwoDifferentMinimums.get_expected_result();
        int result = minimum_index(seq);
        if (result != expected_result) {
            throw new AssertionError("result is different than the expected result");
        }
    }

    public static void main(String[] args) {
        TestWithEmptyArray();
        TestWithUniqueValues();
        TestWithExactlyTwoDifferentMinimums();
        System.out.println("OK");
    }
}
