package ex.collections.set;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        // 이진탐색트리 중 레드블랙트리(Red-Black Tree)로 구현되어 있음
        // 일반적인 이진탐색트리의 경우 높이만큼 시간이 걸림, 균형을 맞춘 레드블랙 트리 이용하여 성능을 높힘

        // 생성
        TreeSet<Integer> set = new TreeSet<Integer>();
        TreeSet<Integer> set2 = new TreeSet<>();
        TreeSet<Integer> set3 = new TreeSet<Integer>(set);
        TreeSet<Integer> set4 = new TreeSet<Integer>(Arrays.asList(1,2,3));

        // 추가
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.lower(3);
        set.higher(3);

        System.out.println(set.ceiling(3)); // 1
        System.out.println(set.floor(3)); // 1
        System.out.println(set.comparator()); // null
        set.descendingIterator(); // [1, 2, 3, 4, 5]
        System.out.println(set);
        set.descendingSet();
        System.out.println(set);// [1, 2, 3, 4, 5]

        // 삭제
        set.remove(1);
        set.clear();

        // 크기
        int size = set.size();

        // 출력
        System.out.println(set.first()); //최소값 출력
        System.out.println(set.last()); //최대값 출력
        System.out.println(set.higher(3)); // 입력값보다 큰 데이터중 최소값 출력 없으면 null
        System.out.println(set.lower(3)); // 입력값보다 작은 데이터중 최대값 출력 없으면 null

        Iterator iter = set.iterator();	// Iterator 사용
        while(iter.hasNext()) {//값이 있으면 true 없으면 false
            System.out.println(iter.next());
        }

        set.ceiling(1);
        set.comparator();
        set.floor(1);
        set.descendingIterator();
        set.descendingSet();

    }
}
