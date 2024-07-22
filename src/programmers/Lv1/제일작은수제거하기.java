package programmers.Lv1;

import java.util.Arrays;

public class 제일작은수제거하기 {

    public int[] solution1(int[] arr) {
        int n = arr.length;
        int[] answer = new int[n-1];
        Arrays.sort(arr);

        // int[] answer = Arrays.copyOfRange(arr, 1, arr.length);
        for(int i=1; i<arr.length; i++) {
            answer[i-1] = arr[n-i];
        }
        return (answer.length > 0) ? answer : new int[]{-1};
    }

    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        int min = arr[0];
        for(int a: arr) {
            if(a < min) min = a;
        }
        int i = 0;
        for(int a: arr) {
            if(a!=min) {
                answer[i] = a;
                i++;
            }
        }
        return (answer.length > 0) ? answer : new int[]{-1};
    }

    // 다른 사람 풀이
    public int[] solution2(int[] arr) {
        if (arr.length <= 1) return new int[]{ -1 };
        int min = Arrays.stream(arr).min().getAsInt(); // 최솟값
        return Arrays.stream(arr).filter(i -> i != min).toArray(); // stream API 이용
    }

    public static void main(String[] args) {
        제일작은수제거하기 sol = new 제일작은수제거하기();
        System.out.println(sol.solution(new int[]{4, 3, 2, 1}).toString()); // {4. 3. 2}
        System.out.println(sol.solution(new int[]{1, 2, 3, 4}).toString()); // {4. 3. 2}
        System.out.println(sol.solution(new int[]{10}).toString()); // {-1}

    }
}
