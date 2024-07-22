package swexpertacademy.Difficulty1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q2068_v2 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int max = 0;
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            while(st.hasMoreTokens()){
                max = Math.max(Integer.parseInt(st.nextToken()), max);
            }
            System.out.printf("#%d %d\n", test_case, max);
        }
        br.close();
    }
}
