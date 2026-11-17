package s01.pythonport;

/** Section 1: port the Python factorial function here, then add tests in src/test/java/s01/pythonport. */
public class Factorial {
public static long factorial(int n) {
    long result = 1L;
    for (int i = 2; i <= n; i++) {
        result *= i;
    }
    return result;}
}
