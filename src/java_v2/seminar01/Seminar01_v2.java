package java_v2.seminar01;

import java.util.Arrays;
import java.util.Scanner;

public class Seminar01_v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // read from console
        System.out.print("Enter min: ");
        Integer minn = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter max: ");
        Integer maxx = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter array's length: ");
        Integer arrayLength = Integer.parseInt(scanner.nextLine());
        Integer[] arrayRandom = new Integer[arrayLength];

        for(int i = 0; i < (arrayRandom.length); i++){
            arrayRandom[i] = (int) (Math.random() * (maxx - minn)) + minn;
        }
        System.out.println(Arrays.toString(arrayRandom));
    }
}
