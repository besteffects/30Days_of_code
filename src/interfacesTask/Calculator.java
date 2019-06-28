package interfacesTask;

// The implementation for the divisorSum(n) method must return the sum of all divisors of n.

class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count = count + i;
            }
        }
        return count;
    }
}