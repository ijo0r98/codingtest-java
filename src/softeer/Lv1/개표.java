package softeer.Lv1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 개표 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
           int T = sc.nextInt();

           String[] answer = new String[T];
           for(int i=0; i<T; i++){
               answer[i]="";
               int n = sc.nextInt();
               int n1 = n/5;
               int n2 = n%5;

               for(int j=0; j<n1; j++) answer[i]+="++++ ";
               for(int j=0; j<n2; j++) answer[i]+="|";
           }

           for(int i=0; i<T; i++) {
               System.out.println(answer[i]);
           }

    }
}
