package ex.collections.list;

import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
//        Vector v = new Vector();
        Vector<String> v = new Vector<>();

        // 추가
        v.add("hello");
        v.add("world");

        // 크기
        int size = v.size();
        int capacity = v.capacity();
        System.out.println(size + " " + capacity); // 2, 10

        // 검색
        boolean isContains = v.contains("hello");
        System.out.println(isContains); // true
        int s = v.indexOf("world");
        System.out.println(s); // 1

        // 수정
        v.set(0, "hi");
        System.out.println(v); // [hi, world]

        // 삭제
        v.remove(0);
        v.removeAllElements();
        v.clear();
    }
}
