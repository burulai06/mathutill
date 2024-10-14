import java.sql.SQLOutput;
public class Main {
    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        int n = 7;
        int N = 5;
        int f = 5;
        System.out.println("The greatest common divisor : " + MathUtill.gcd(a, b));
        System.out.println("The least common multiple: " + MathUtill.lcm(a, b));
        System.out.println("Prime is " + MathUtill.isPrime(n));
        System.out.println("Fibonacci:" + MathUtill.fibonacci(N));
        System.out.println("factorial:" + MathUtill.factorial(f));
        System.out.println("  ");
        System.out.println("NON STATIC method");
        MathUtill myNum = new MathUtill();
        MathUtill mySum = new MathUtill();
        MathUtill myRev = new MathUtill();
        MathUtill myNext = new MathUtill();
        System.out.println("Perfect number is " + myNum.isPerfectNumber(5));
        System.out.println("Sum of digit:" + mySum.sumOfDigit(556));
        System.out.println("Reversing of numbers:" + myRev.reverseNumber(123));
        System.out.println("The next prime number is " + myNext.nextPrime(10));
    }
}