package softeer.Lv1;

import java.util.*;
import java.io.*;

public class 위험한효도 {
    public static void main(String[] args) throws Exception {
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           StringTokenizer st = new StringTokenizer(br.readLine(), " ");

           int a = Integer.parseInt(st.nextToken());
           int b = Integer.parseInt(st.nextToken());
           int d = Integer.parseInt(st.nextToken());

           br.close();

           int res = 0;
           // System.out.println(a + " "+b + " "+" "+d/a+" "+d%a);

           // int aa = d/a;
           // if(aa==1) {
           //     res += (aa*a);
           // } else {
           //     res += ((aa*a) + (aa)*b);
           // }
           // res += (d-aa*a);
           // // System.out.println(aa + " " + res);

           // int bb = d/b;
           // if(bb==1) {
           //     res += (bb*b);
           // } else {
           //     // System.out.println(((bb*b) + (bb-1)*a));
           //     res += ((bb*b) + (bb)*a);
           // }
           // res += (d-bb*b);
           // // System.out.println(bb + " " + res);


           // System.out.println(res);

           int t = 0; //걸린 시간
           int n = (d>a)? d / a : 0; //가는 길에 술래가 돌아본 횟수
           int m = (d>b)? d / b : 0; //돌아오는 길에 술래가 돌아본 횟수

           t = 2 * d + a * m + b * n;

           //System.out.println(a + "" + b + "" + d);
           System.out.print(t);
       }
}
