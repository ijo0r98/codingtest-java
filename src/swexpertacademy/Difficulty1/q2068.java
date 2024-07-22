package swexpertacademy.Difficulty1;

import java.util.Scanner;

public class q2068 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int test_case = 1; test_case <= T ; test_case++){
            int max = 0;
            for(int i=0; i<10; i++){
                max = Math.max(max, sc.nextInt());
            }
            System.out.printf("#%d %d\n", test_case, max);
        }
        sc.close();
    }
}
