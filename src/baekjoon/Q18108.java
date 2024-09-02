package baekjoon;

import java.io.IOException;
import java.util.Scanner;

// 1998년생인 내가 태국에서는 2541년생?!
public class q18108 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(n - (2541-1998));
    }
}
