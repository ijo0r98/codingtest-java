package swexpertacademy.Difficulty1;

import java.util.Scanner;

public class q2058 {
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        while(N>0){
            sum += (N%10);
            N = N/10;
        }
        System.out.println(sum);
        sc.close();
    }
}
