public class TwoDArraysExample {
    private static int[][] createArray1() {
        int rowSize = 2;
        int colSize = 4;
        int[][] myArray1 = new int[rowSize][colSize];
       /* The outer loop represents the matrix's rows and uses as i its variable, and the inner loop
       represents the matrix's columns and uses j as its variable. The code below assigns the value
       of to each element in the 2D array we declared previously:
        */
        int count = 0;
        for(int i = 0; i < rowSize; i++) {
            for(int j = 0; j < colSize; j++, count++) {
                myArray1[i][j] = count;
            }
        }
        for(int i = 0; i < rowSize; i++) {
            // print the row of space-separated values
            for(int j = 0; j < colSize; j++) {
                System.out.print(myArray1[i][j] + " ");
            }
            // end of row is reached, print newline
            System.out.println();
        }
    return myArray1;
    }
    public static void main(String[] args) {
        createArray1();
    }
}
