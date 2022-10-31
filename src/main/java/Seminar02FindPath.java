package main.java;

public class Seminar02FindPath {
    public static void main(String[] args) {
        findPath(3, 99, 2, 2, "");
        // K1 - сложили
        // K2 - умножили
    }
    public static void findPath(int source, int target, int addend, int multiplier, String path){
        if (source > target) return; // ok
        // if (source > target)
        // return; // - нельзя так
        if (source == target) {
            System.out.println((path));
            return;
        }
        findPath(source + addend, target, addend, multiplier, path + "K1");
        findPath(source * multiplier, target, addend, multiplier, path + "K2");
    }
}
