package org.bloomtech.bd.codealong;

import java.util.HashMap;
import java.util.Map;

public class Memoization {
    private Map<Integer, Integer> lookup = new HashMap<>();

    public int fibonacci(int n) {
        // TODO Your Code Here
        return 0;
    }

    public static void main(String[] args) {
        Memoization memoization = new Memoization();
        System.out.println(memoization.fibonacci(0)); //0
        System.out.println(memoization.fibonacci(1)); //1
        System.out.println(memoization.fibonacci(2)); //1
        System.out.println(memoization.fibonacci(8)); //21
        System.out.println(memoization.fibonacci(17)); //1597
        System.out.println(memoization.fibonacci(38)); //39088169
    }
}
