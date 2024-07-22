package baekjoon.Lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// a+b
public class Q1000 {
    public static void main(String[] args) throws IOException {

        // Scanner
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+b);
        sc.close();

        // BufferReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a2 = br.read()-48;
        br.read();
        int b2 = br.read()-48;
        System.out.println(a2 + b2);

        // System.in
        int a3 = System.in.read();
        System.in.read();
        int b3 = System.in.read();
        System.in.read();
        a3 = a3-48; // a3 - '0'
        b3 = b3-48;
        System.out.println(a3 + b3);

    }
}
