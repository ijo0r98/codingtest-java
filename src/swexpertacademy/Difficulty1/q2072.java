package swexpertacademy.Difficulty1;

import java.util.Scanner;

public class q2072 {
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            /////////////////////////////////////////////////////////////////////////////////////////////
            int oddSum=0;
            for(int i=0; i<10; i++) {
                int n = sc.nextInt();
                if(n%2==1) oddSum+=n;
            }

            System.out.println("#"+test_case+" "+oddSum);
        }

        sc.close();
    }

}
