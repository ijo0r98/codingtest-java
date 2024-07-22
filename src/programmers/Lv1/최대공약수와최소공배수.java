package programmers.Lv1;

import java.util.Arrays;

public class 최대공약수와최소공배수 {

    public int[] solution(int n, int m) {
        int gcd = gcd(n, m);
        int lcd = lcd(n, m, gcd);
        return new int[]{gcd, lcd};
    }

    public int gcd(int n, int m) {
        while(m!=0) {
            int tmp = n%m;
            n = m;
            m = tmp;
        }
        return n;
    }

    public int lcd(int n, int m, int gcd) {
        // 최소공배수
        return (int)(n*m/gcd);
    }

    public static void main(String[] args) {
        최대공약수와최소공배수 sol = new 최대공약수와최소공배수();
        System.out.println(Arrays.toString(sol.solution(3, 12)));
        System.out.println(Arrays.toString(sol.solution(2, 5)));
    }
}
