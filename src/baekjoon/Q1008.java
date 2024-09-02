package baekjoon;

import java.io.IOException;

// a/b
public class q1008 {
    public static void main(String[] args) throws IOException {
        double a = System.in.read() -'0';
        System.in.read();
        double b = System.in.read() - '0';

        System.out.print(a/b);
    }
}
