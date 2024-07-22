package programmers.Lv1;

public class 자릿수더하기 {
    public int solution(int n) {
        int answer = 0;
        while(n > 0) {
            answer += (n%10);
            n /= 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        자릿수더하기 sol = new 자릿수더하기();
        System.out.println(sol.solution(123));
        System.out.println(sol.solution(987));
    }
}
