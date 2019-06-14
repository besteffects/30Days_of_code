public class RecursionBasics {

    public static void main(String[] args){
        System.out.println(exponentiation(5,3));

    }
    public static int exponentiation(int n, int p) {
        //Base case
        if (p <= 0) {
            return 1;
        }
        //Recursive
        else{
            // 5*exponentiation(5,2)
            // 5*5*exponentiation(5.1)
            //5*5*5*exponentiation(5,0)
            // 5*5*5*1
            return n*exponentiation(n, p-1);
        }
    }
}
