package main.java;

public class Seminar02Task02 {
    public static void main(String[] args) {
        double x1 = 2.00000;
        int n1 = 10;
        double x2 = 2.10000;
        int n2 = 3;
        double x3 = 2.00000;
        int n3 = -2;
        System.out.println(myPow(x1, n1));
        System.out.println(myPow(x2, n2));
        System.out.println(myPow(x3, n3));
    }
    public static double myPow(double x, int n) {
        if(n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        if (n < 0) {
            return 1 / x * myPow(x, n + 1);
        }
        return x * myPow(x, n - 1);
    }
}
