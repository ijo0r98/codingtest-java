package swexpertacademy.Difficulty1;

import java.util.Scanner;

public class q2071 {
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int sum=0;
            for(int i=0; i<10; i++){
                int n = sc.nextInt();
                sum += n;
            }

            /**
             * 실수에서 첫째자리 반올림 > 10이 아닌 10.0으로 나눔
             */
            System.out.println("#"+test_case+" "+Math.round(sum/10.0));
        }
    }
}
