public class Seminar02Hanoi {
    public static void main(String[] args){
        hanoiTower(3, "1", "3", "2");
    }
    public static void hanoiTower(int n, String source, String target, String buffer){
        if (n == 1) {
            System.out.printf("from %s to %s", source, target);
            System.out.println();
            return;
        }
        hanoiTower(n - 1, source, buffer, target);
        System.out.printf("%d from %s", n, source, target);
        System.out.println();
        hanoiTower(n -1, buffer, target, source);
    }
}
