package ex.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String,Integer>();
        HashMap<String,Integer> map2 = new HashMap<>();
        HashMap<String, Integer> map3 = new HashMap<>(map);
        HashMap<String, Integer> map4 = new HashMap<>(10);
        HashMap<String, Integer> map5 = new HashMap<>(10, 0.7f);

        HashMap<String,String> map6 = new HashMap<String,String>(){{
            put("a","b");
        }};

        // 추가
        map.put("hello", 1);
        map.put("world", 2);
        System.out.println(map); // {world=2, hello=1}

        // 출력
        map.get("hello"); // key==hello 값 조회
        System.out.println(map.get("hello")); // 1

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("key: " + entry.getKey() + " / value: " + entry.getValue());
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
