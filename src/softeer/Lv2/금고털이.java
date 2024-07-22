package softeer.Lv2;

import java.io.*;
import java.util.*;

class Item {
  int w;
  int p;
  public Item(int w, int p) {
    this.w = w;
    this.p = p;
  }
}
public class 금고털이 {

    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      //배낭의 무게, 귀금속의 종류
      StringTokenizer st = new StringTokenizer(br.readLine());
      int W = Integer.parseInt(st.nextToken());
      int N = Integer.parseInt(st.nextToken());

      ArrayList<Item> items = new ArrayList<>();
      for(int i=0; i<N; i++){
        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken()); //금속의 무게
        int P = Integer.parseInt(st.nextToken()); //무게당 가격
        items.add(new Item(M, P));
      }

      Collections.sort(items, (i1, i2) -> {
        return i2.p - i1.p;
      });

      int result = 0;
      for(Item item : items) {
        if(W == 0) break;

        if(W >= item.w) { //금속의 무게만큼 담는 경우
          result += (item.w * item.p);
          W = W - item.w;
        } else { //전동톱으로 자르고 담는 경우
          result += (W * item.p);
          W = 0;
        }
      }
      System.out.println(result);
    }
}