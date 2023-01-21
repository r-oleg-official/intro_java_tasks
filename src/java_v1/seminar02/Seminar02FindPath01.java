package java_v1.seminar02;

public class Seminar02FindPath01 {
    public static void main(String[] args) {
        findPath("Налево", 0);
    }
    public static void findPath(String path, int count){
        if (count == 5) return;
        System.out.println("сходил " + path);
        findPath("Налево", count + 1);
        findPath("Направо", count + 1);
    }
}
