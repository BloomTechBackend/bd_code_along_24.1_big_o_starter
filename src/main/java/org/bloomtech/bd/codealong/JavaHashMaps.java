package org.bloomtech.bd.codealong;

import java.util.HashMap;
import java.util.Map;

public class JavaHashMaps {
    public Map<Integer, Character> solution(int n) {
        // TODO Your Code Here
        return null;
    }

    public static void main(String[] args) {
        JavaHashMaps javaHashMaps = new JavaHashMaps();
        int n = 26;
        Map<Integer, Character> alphabets = javaHashMaps.solution(n);
        System.out.println(alphabets.get(1)); //b
        System.out.println(alphabets.get(24)); //y
        System.out.println(alphabets.get(25)); //z
    }
}
