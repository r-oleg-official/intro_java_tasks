package main.java;

import java.util.LinkedList;
import java.util.List;

public class Seminar04 {
    public static void main(String[] args) {
        List<Integer> linked = new LinkedList<>();
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < 50000; i++) {
            linked.add(0, i);
        }

    }
}
