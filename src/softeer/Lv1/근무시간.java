package softeer.Lv1;

import java.util.*;
import java.io.*;

public class 근무시간 {
    public static void main(String[] args) throws Exception{
       int res = 0;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       for(int i=0; i<5; i++) {
           StringTokenizer st = new StringTokenizer(br.readLine(), " ");
           String t1 = st.nextToken();
           String t2 = st.nextToken();

           String[] hm1 = t1.split(":");
           int h1 = Integer.parseInt(hm1[0]);
           int m1 = Integer.parseInt(hm1[1]);

           int h2 = Integer.parseInt(t2.split(":")[0]);
           int m2 = Integer.parseInt(t2.split(":")[1]);
           // String[] hm2 = t1.split(":");
           // h2 = hm2[0];
           // m2 = hm2[1];

           int time = 0;
           // t2-t1
           if(m2<m1) {
               m2 += 60;
               h2 -= 1;
           }
           res += ((m2-m1) + (h2-h1)*60);
       }

       System.out.println(res);
   }
}
