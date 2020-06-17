package vn.edu.funix.algo;

public class EuclidGCD {
    public static int findGCD(int a, int b) {
        // find greatest common divisor
        int m = a;
        int n = b;
        int r;
        while((r = m%n) != 0) {
            m = n;
            n = r;
        }
        return n;
    }
}
