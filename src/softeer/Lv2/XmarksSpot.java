package softeer.Lv2;

import java.util.*;
import java.io.*;

public class XmarksSpot {
    public static void main(String[] args) throws Exception{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n = Integer.parseInt(br.readLine());

       // String res = "";
       StringBuilder sb = new StringBuilder();
       for(int i=0; i<n; i++){
           StringTokenizer st = new StringTokenizer(br.readLine(), " ");
           String s1 = st.nextToken().toUpperCase();
           // String s2 = st.nextToken();

           int idx = s1.indexOf("X");
           // res += s2.charAt(idx).toUpperCase();
           // sb.append((toString(s2.charAt(idx))).toUpperCase());

           String[] s2 = st.nextToken().split("");
           sb.append(s2[idx].toUpperCase());

       }
       br.close();

       System.out.println(sb.toString());
   }
}
