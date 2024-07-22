package baekjoon.Lv1;

import java.io.IOException;
import java.util.Scanner;

// 사칙연산
public class Q10869 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.print((a+b) + "\n" + (a-b) + "\n" + (a*b) + "\n" + (a/b) + "\n" + (a%b));
    }
}
