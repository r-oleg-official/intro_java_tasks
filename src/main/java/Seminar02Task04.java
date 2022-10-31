package main.java;

public class Seminar02Task04 {
    public static void main(String[] args) {
        int target = 0;
        int n = 5;
        findPath( 0, n, target, "");
    }
    public static void findPath(int k, int n, int target, String path){
        if (k == n) {
            target = 0;
            return;
        }
        findPath(k + 1, n, target, "1");
        findPath(k + 2, n, target, "2");
    }
}
