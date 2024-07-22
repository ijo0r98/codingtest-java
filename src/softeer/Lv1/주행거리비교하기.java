package softeer.Lv1;

import java.util.*;
import java.io.*;

public class 주행거리비교하기 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if (a==b) System.out.println("same");
        else if (a>b) System.out.println("A");
        else System.out.println("B");
    }
}
