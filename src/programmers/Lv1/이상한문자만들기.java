package programmers.Lv1;

public class 이상한문자만들기 {

    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        char[] chars = s.toCharArray();
        int j = 0;
        for(int i=0; i<s.length(); i++) {
            char c = chars[i];
            if(chars[i] == ' ') {
                j = 0;
            } else {
                if(j%2==0) {
                    c = String.valueOf(c).toUpperCase().charAt(0);
                } else {
                    c = String.valueOf(c).toLowerCase().charAt(0);
                }
                j++;
            }
            answer.append(c);
        }
        return answer.toString();
    }

    // 다른 사람 코드 1
    public String solution1(String s) {
        String answer = "";
        int index = 0; // 문자열 인덱스
        String[] words = s.split(""); // 문장에서 문자 하나씩 구분하여 배열에 담음

        for(String word: words) {
            index = word.contains(" ") ? 0 : index + 1; // 빈칸이면 0, 아니면 인덱스 증가
            answer += index%2 == 0 ? word.toLowerCase() : word.toUpperCase(); // 위치에 따라 대,소문자 변환
        }
      return answer;
    }

    public static void main(String[] args) {
        이상한문자만들기 sol = new 이상한문자만들기();
        System.out.println(sol.solution("try hello world"));
    }
}
