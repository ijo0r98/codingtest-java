package baekjoon.Lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// ??!
public class Q10926 {
    public static void main(String[] args) throws IOException {

        // Scanner
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str + "??!");
        sc.close();

        // BufferReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(br.readLine() + "??!" );
    }
}
