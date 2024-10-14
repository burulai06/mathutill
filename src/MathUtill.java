public class MathUtill {
    //isPrime
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    //the greatest common divisor
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    //the least common multiple
    public static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    //Fibonacci
    public static int fibonacci(int N) {
        if (N <= 1)
            return N;
        return fibonacci(N - 1) + fibonacci(N - 2);
    }

    //factorial
    public static int factorial(int f) {
        int a = 1;
        for (int i = 2; i <= f; i++)
            a *= i;
        return a;
    }

    //NON STATIC :
    //isPerfectNumber
    public boolean isPerfectNumber(int num) {
        if (num == 1)
            return false;
        int sum = 1;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num)
            return true;
        return false;
    }

    //sumOfDigits
    public int sumOfDigit(int d) {
        int sum = 0;
        while (d != 0) {
            sum = sum + d % 10;
            d = d / 10;
        }
        return sum;
    }

    //reverseNumber
    public int reverseNumber(int reverse) {
        int rev_num = 0;
        while (reverse > 0) {
            rev_num = rev_num * 10 + reverse % 10;
            reverse = reverse / 10;
        }
        return rev_num;
    }

    //nextPrime
    static int nextPrime(int Prime){
        if (Prime <= 1)
            return 2;

        int prime = Prime;
        boolean found = false;
        while(!found) {
            prime++;
            if (isPrime(prime))
                found = true;
        }
        return prime;
    }
}