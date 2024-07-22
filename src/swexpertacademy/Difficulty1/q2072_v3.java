package swexpertacademy.Difficulty1;

import java.io.*;
import java.util.*;

public class q2072_v3 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int test = Integer.parseInt(br.readLine());

        for (int i = 1; i <= test; i++) {
            int sum = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) {
                int tmp = Integer.parseInt(st.nextToken());
                if (tmp % 2 == 1)
                    sum += tmp;
            }
            bw.write("#" + i + " " + sum + "\n");
        }
        bw.flush();
    }
}
