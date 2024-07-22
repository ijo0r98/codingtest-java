package programmers.Lv1;

import java.util.Arrays;

public class 평균구하기 {
    public double solution(int[] arr) {
        return Arrays.stream(arr).average().orElse(0);
    }

    public static void main(String[] args) {
        평균구하기 solution = new 평균구하기();
        int[] arr = {1, 2, 3, 4};
        double answer = solution.solution(arr);
        System.out.println(answer);
    }
}