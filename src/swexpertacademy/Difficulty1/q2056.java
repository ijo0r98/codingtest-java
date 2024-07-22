package swexpertacademy.Difficulty1;

import java.util.List;
import java.util.Scanner;

public class q2056 {
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for(int test_case = 1; test_case <= T; test_case++)
        {
            // YYYYMMDD
            String input = sc.next();
            int mm = Integer.parseInt(input.substring(4, 6));
            int dd = Integer.parseInt(input.substring(6, 8));

            if(mm>0 && mm <= 12) {
                if(dd <= days[mm] && dd >0 ) {
                    System.out.printf("#%d %s/%s/%s\n",test_case, input.substring(0,4), input.substring(4, 6), input.substring(6, 8));
                    continue;
                }
            }

            System.out.printf("#%d -1\n",test_case);
        }
    }
}
