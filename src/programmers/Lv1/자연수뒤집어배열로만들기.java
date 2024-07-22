package programmers.Lv1;

import java.util.Arrays;

public class 자연수뒤집어배열로만들기 {

    public int[] solution_(long n) {
        char[] chars = String.valueOf(n).toCharArray();
        int[] answer = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[chars.length - i - 1]);
            answer[i] = Character.getNumericValue(chars[chars.length - i - 1]);
        }
        return answer;
    }

    // 내 코드 2
    public int[] solution(long n) {
        int[] answer = new int[String.valueOf(n).toCharArray().length];
        for(int i=0; i<answer.length; i++) {
            answer[i] = (int)(n%10);
            n /= 10;
        }
        return answer;
    }

    // 다른 사람 코드 1
    public int[] solution1(long n) {
        String a = "" + n; // long -> String 변환
        int[] answer = new int[a.length()];
        int cnt = 0;
        while (n > 0) {
            answer[cnt] = (int) (n % 10); // 일의자리부터 정답 문자열에 추가(역순)
            n /= 10;
            cnt++;
        }
        return answer;
    }

    // 다른 사람 코드 2
    public int[] solution2(long n) {
        String s = String.valueOf(n); // long -> String
        StringBuilder sb = new StringBuilder(s); // 동적 할당 가능한 문자열
        String[] strings = sb.reverse().toString().split(""); // 역순 정렬 이후 각 문자로 나눠 배열에 저장

        int[] answer = new int[strings.length]; // int 정답 배열
        for (int i = 0; i < strings.length; i++) {
            answer[i] = Integer.parseInt(strings[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        자연수뒤집어배열로만들기 sol = new 자연수뒤집어배열로만들기();
        System.out.println(Arrays.toString(sol.solution(12345)));
    }
}
