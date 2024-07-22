package swexpertacademy.Difficulty1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class q2072_v2 {

    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int oddSum=0;

            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");
            while(st.hasMoreTokens()) {
                int n=Integer.parseInt(st.nextToken());
                if(n%2!=0) oddSum+=n;
            }

            System.out.println("#"+test_case+" "+oddSum);
        }

        br.close();
    }

    /**
     * 20:42:52 (Runtime error)
     * Error Message:
     * Memory error occured, (e.g. segmentation error, memory limit Exceed, stack overflow,... etc)
     */
}
