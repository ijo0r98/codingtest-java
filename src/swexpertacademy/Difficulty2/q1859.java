package swexpertacademy.Difficulty2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 1859. 백만 장자 프로젝트 
 * 
 * 참고 https://thisismi.tistory.com/entry/SW-Expert-Academy-1859-%EB%B0%B1%EB%A7%8C-%EC%9E%A5%EC%9E%90-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8
 * 
 * 최대 전까지 자재 구매 후, 최대 금액일 때 판매하는 것이 가장 이익
 * 최대 금액이 리스트 중간에 있을 경우, 판매 후 다시 그 다음 최대금액까지 구매 후 판매
 * 
 * 참고 https://dundung.tistory.com/119
 * 뒤에서부터 순회해야함 > 큰 값 기준으로 판매하기 때문..
 */
public class q1859 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
				
		for(int i=0; i<T; i++) {
			int n = sc.nextInt();
			
			List<Integer> nlist = new ArrayList<Integer>();
	        for(int j=0; j<n; j++) nlist.add(sc.nextInt());
			
	        long ans = 0; // ** int > long 정답 통과
	        
			int max = nlist.get(n-1); // 뒤에서부터 순회(mx가 판매 가격)
			for(int j=n-2; j>=0; j--) {
				if(max>nlist.get(j)) ans+= (max-nlist.get(j)); // 판매 가격이 아직 더 높을 때 그날 구매하여 max 가격으로 판매, max(판매가격)-nlist[j](현재 구매가격)
				else max=nlist.get(j); // 판매 가격이 더 높아지면 판매가격을 바
			}
			
			System.out.printf("#%d %d\n",i+1, ans);
		}
		
		
		sc.close();
	}
}
