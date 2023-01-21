package java_v1.seminar02;

import java.util.ArrayList;
import java.util.List;

public class Seminar02Task01 {
    public static List<List<Integer>> list;
    public static List<Integer> tmp;

    public static void main(String[] args) {

        System.out.println(combine(4, 2));
        System.out.println(combine(1, 1));
    }

    public static List<List<Integer>> combine(int n, int k) {
        list = new ArrayList<>();
        tmp = new ArrayList<>();
        if (k > n || n <= 0 || k <= 0) {
            return list;
        }
        tmpList(n, k, 1);
        return list;
    }

    private static void tmpList(int n, int k, int start) {

        if (k == 0) {
            list.add(new ArrayList<>(tmp));
            return;
        }

        for (int i = start; i <= n; i++) {
            tmp.add(i);
            tmpList(n, k - 1, i + 1);
            tmp.remove(tmp.size() - 1);
        }
    }
}