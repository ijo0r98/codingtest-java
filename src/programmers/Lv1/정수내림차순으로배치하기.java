package programmers.Lv1;

import java.lang.reflect.Array;
import java.util.*;

public class 정수내림차순으로배치하기 {

    // 내 코드
    public long solution(long n) {
        ArrayList<Long> list = new ArrayList<>();
        while(n>0) {
            list.add((long)(n%10));
            n/=10;
        }
        Collections.sort(list, Collections.reverseOrder());
        long answer = list.get(list.size()-1);
        for(int i=1; i<list.size(); i++) {
            answer += (list.get(list.size()-i-1)*(Math.pow(10.0,(double) i)));
        }
        return answer;
    }

    // 다른 사람 코드 1
    String res = "";
    public long solution2(int n) {
        res = "";
        Integer.toString(n).chars().sorted().forEach(c -> res = Character.valueOf((char)c) + res);
        return Long.parseLong(res);
    }

    // 다른 사람 코드 2
    public long solution3(long n) {
        String[] list = String.valueOf(n).split(""); // 문자열로 변환 후 한글자씩 split
        Arrays.sort(list); // 오름차순 정렬

        StringBuilder sb = new StringBuilder();
        for(String s: list) sb.append(s); // 하나의 문자열로 합침

        return Long.parseLong(sb.reverse().toString()); // Long 형변환
    }

    // 다른 사람 코드 3
    public int solution3(int n) {
        String str = Integer.toString(n);
        char[] c = str.toCharArray(); // 문자열을 char 배열로 변환
        Arrays.sort(c); // 정렬
        StringBuilder sb = new StringBuilder(new String(c, 0, c.length)); // string builder 이용하여 하나의 문자열로 생성
        return Integer.parseInt((sb.reverse()).toString()); // int 형변환
    }

    public static void main(String[] args) {
        정수내림차순으로배치하기 sol = new 정수내림차순으로배치하기();
        System.out.println(sol.solution(118372));
    }
}
