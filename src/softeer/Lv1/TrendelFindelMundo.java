package softeer.Lv1;

import java.util.Scanner;

public class TrendelFindelMundo {
    public static void main(String[] args) {
           Scanner sc =  new Scanner(System.in);
           int N = sc.nextInt();

           int answer_x = 1001;
           int answer_y = 1001;

           for (int i=0; i<N; i++){
               int x = sc.nextInt();
               int y = sc.nextInt();
               // sc.nextLine();

               if(y < answer_y) {
                   answer_x = x;
                   answer_y = y;
               }
           }

           System.out.println(answer_x+" "+answer_y);

       }

}
