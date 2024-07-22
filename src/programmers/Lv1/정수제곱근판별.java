package programmers.Lv1;

public class 정수제곱근판별 {

    public long solution(long n) {
        double pow = Math.pow(n,0.5);
        return (pow*10)%10 == 0 ? (long) Math.pow(pow+1, 2) : -1;
    }


    // 다른 사람 풀이 1
    public long solution1(long n) {
        if (Math.pow((int)Math.sqrt(n), 2) == n) {
              return (long) Math.pow(Math.sqrt(n) + 1, 2);
          }
          return -1;
    }

    public static void main(String[] args) {
        정수제곱근판별 sol = new 정수제곱근판별();

        System.out.println(sol.solution(121));
        System.out.println(sol.solution(3));
    }
}
