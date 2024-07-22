package softeer.Lv2;

import java.util.*;
import java.io.*;

public class 연탄의크기 {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");

        Arrays.sort(arr);

        int res = 0;
        // for(int i=0; i<n; i++){

        for(int i=2; i<Integer.parseInt(arr[arr.length-1])+1; i++) {
            int cnt = 0;
            for(int j=0; j<n; j++) {
                if(Integer.parseInt(arr[j]) % i == 0) cnt++;
            }
            res = Math.max(res, cnt);
        }

        System.out.println(res);



        br.close();
        // sc.close();

    }

}
