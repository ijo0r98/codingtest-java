package swexpertacademy.Difficulty1;

import java.io.*;
import java.util.*;

public class q2063 {
    public static void main(String args[]) throws Exception
    {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int T = Integer.parseInt(br.readLine());

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        List<Integer> numList = new ArrayList<>();
        for(int test_case = 1; test_case <= T; test_case++)
        {
//            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//            while(st.hasMoreTokens()){
//                numList.add(Integer.parseInt(st.nextToken()));
//            }
            numList.add(sc.nextInt());
        }
        Collections.sort(numList);
        System.out.println(numList.get(T/2));
    }
}
