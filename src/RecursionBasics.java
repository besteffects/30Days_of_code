public class RecursionBasics {

    public static void main(String[] args) {
        System.out.println(exponentiation(5, 3));
        System.out.println(summation(3));
        System.out.println(factorial(3));
    }

    public static int exponentiation(int n, int p) {
        //Base case
        int result;
        if (p <= 0) {
            return 1;
        }
        //Recursive
        else {
            // 5*exponentiation(5,2)
            // 5*5*exponentiation(5.1)
            //5*5*5*exponentiation(5,0)
            result = n * exponentiation(n, p - 1);   // 5*5*5*1
            return result;
        }
    }

    public static int summation(int n) {
        //Base case: We are at the end
        if (n <= 0) {
            return 0;
        } else {
            //3+summation(2)
            //3+2+summation(1)
            //3+2+1+summation(0)
            //3+2+1+0=6
            return n + summation(n - 1);
        }
    }

    public static int factorial(int n){
        //base case
        if (n<=1){
            return 1;
        }
        //Recursive case
        else{
            //Factorial(4)=4*Factorial(3)
            //4*3*Factorial(2)
            //4*3*2*Factorial(1)
            //4*3*2*1
            return n*factorial(n-1);
        }
    }
}
