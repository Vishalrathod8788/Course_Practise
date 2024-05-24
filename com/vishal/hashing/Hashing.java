package com.vishal.hashing;
import java.util.*;
public class Hashing {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("vishal", 1);
        hm.put("rathod", 2);
        hm.put("VGR", 3);
        hm.put("Coder", 4);
        hm.put("Developer", 5);
        System.out.println(hm);
        System.out.println(hm.get("vishal"));
        System.out.println(hm.containsKey("vishal"));
        System.out.println(hm.containsValue(1));
        System.out.println(hm.size());
        System.out.println(hm.isEmpty());
//        hm.remove("vishal");
        System.out.println(hm);
//        Set<String> s = hm.keySet();
        for(String i : hm.keySet()){
            System.out.println(i);
        }
        for (int i : hm.values()){
            System.out.println(i);
        }

    }
}
