package softeer.Lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 연탄배달의시작 {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int n = sc.nextInt();
        int prev = sc.nextInt();
        List<Integer> dis = new ArrayList<>();

        for(int i=1; i<n; i++) {
            int x = sc.nextInt();
            dis.add(x-prev);
            prev = x;

        }

        int min = Collections.min(dis);
        int answer = Collections.frequency(dis, min);

        System.out.print(answer);
    }
}
