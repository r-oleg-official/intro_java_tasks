import java.util.Scanner;

public class Seminar01 {
    public static void main(String[] args) {
        System.out.println("bye, world!");
        String a = "oleg";
        String b = "oleg";
        Scanner scanner = new Scanner(System.in); // read from console
        System.out.println("Enter name");
        String name = scanner.nextLine();
        System.out.print("Enter name2");
        String name2 = scanner.nextLine();
        long age = 23; // 2^64
        int smallInt = (int) age; // 2^32 - приведение
        long bigInt = age; // неявное приведение
        //
    }
}
