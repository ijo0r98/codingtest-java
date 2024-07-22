package softeer.Lv1;

import java.io.*;
import java.util.*;

public class 나무심기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0; i<n; i++){
            arr.add(sc.nextInt());
        }

        Collections.sort(arr);
        int res = 0;
        res = ((arr.get(0)*arr.get(1) > arr.get(n-1)*arr.get(n-2)) ? arr.get(0)*arr.get(1) : arr.get(n-1)*arr.get(n-2));
        System.out.println(res);
    }
}
