package programmers.Lv1;

// x만큼 간격이 있는 n개의 숫자
public class 간격이있는숫자 {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];
        for(int i=0 ; i < n ; i++) {
            answer[i] = (x * (i+1));
        }
        return answer;
    }
}
