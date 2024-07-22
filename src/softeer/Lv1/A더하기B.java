package softeer.Lv1;

import java.util.*;

public class A더하기B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("Case #"+(i+1)+": "+Integer.toString(a+b));
        }
    }
}
