package ex.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        // 입력된 순서 기억
        Map<String, String> map = new LinkedHashMap<String, String>();

        map.put("Google", "USA");
        map.put("Naver", "Korea");
        map.put("Facebook", "USA");

        for(Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
