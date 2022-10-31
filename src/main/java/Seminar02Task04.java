package main.java;

public class Seminar02Task04 {
    public static void main(String[] args) {
        System.out.println(climbStairs(2));
        System.out.println(climbStairs(3));
    }

    public static int climbStairs(int n) {
        if (n <= 2)
            return n;
        int oneStep = 1;
        int twoStep = 2;
        for (int i = 3; i <= n; i++) {
            int temp = oneStep;
            oneStep = twoStep;
            twoStep += temp;
        }
        return twoStep;
    }
}
