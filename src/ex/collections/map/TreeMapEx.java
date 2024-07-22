package ex.collections.map;

import java.util.*;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<String,Integer>();
        TreeMap<String,Integer> map2 = new TreeMap<>();
        TreeMap<String, Integer> map3 = new TreeMap<>(map);

        TreeMap<String,String> map6 = new TreeMap<String,String>(){{
            put("a", "b");
        }};




        // 추가
        map.put("hello", 1);
        map.put("world", 2);
//        System.out.println(map); // {world=2, hello=1}

        TreeMap<Integer, String> map11 = new TreeMap<Integer, String>(){{
            put(1, "hello");
            put(2, "world");
            put(3, "bye");
            put(4, "world!");
        }};


        Integer firstKey = map11.firstKey();
        System.out.println(firstKey); // 1
        Integer floorKey = map11.floorKey(3);
        System.out.println(floorKey); // 3

        Map.Entry<Integer, String> ceilingEntry = map11.ceilingEntry(2);
        System.out.println(ceilingEntry); // 1=hello

        Map.Entry<Integer, String> floorEntry = map11.floorEntry(4);
        System.out.println(floorEntry); // 4=world!


        // 출력
        map.get("hello"); // key==hello 값 조회
        System.out.println(map.get("hello")); // 1

        for(Map.Entry<String, Integer> entryd : map.entrySet()) {
            System.out.println("key: " + entryd.getKey() + " / value: " + entryd.getValue());
        }
//        key: world / value: 2
//        key: hello / value: 1

        for(String s : map.keySet()) {
            System.out.println("key: " + s + " value: " + map.get(s));
        }

        Iterator<String> keys = map.keySet().iterator();
        while(keys.hasNext()) {
            String key = keys.next();
            System.out.println("key: " + key + " / value: " + map.get(key));
        }

        // 수정
        map.replace("hello", 100);
        System.out.println(map); // {world=2, hello=100}

        boolean isContains = map.containsKey("hi");
        System.out.println(isContains); // false

        // 삭제
        map.remove("hello"); // key로 삭제
        map.clear();
    }
}
