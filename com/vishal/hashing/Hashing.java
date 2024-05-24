package com.vishal.hashing;
import java.util.*;
public class Hashing {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("vishal", 1);
        hm.put("vishal", 2);
        System.out.println(hm);
        System.out.println(hm.get("vishal"));
        System.out.println(hm.containsKey("vishal"));
        System.out.println(hm.containsValue(1));
        System.out.println(hm.size());
        System.out.println(hm.isEmpty());
        hm.remove("vishal");
        System.out.println(hm);
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        System.out.println(hm.entrySet());
    }
}
