package programmers.Lv1;

public class 핸드폰번호가리기 {

    public String solution(String phone_number) {

        int len = phone_number.length();

        // java 8
        char[] answer = phone_number.toCharArray();
        for(int i=0; i<len-4; i++){
            answer[i] = "*".charAt(0);
        }
        return String.valueOf(answer);

        // java 11
//        return "*".repeat(len-4) + phone_number.substring(len-4, len);
    }

    public static void main(String[] args) {
        핸드폰번호가리기 sol = new 핸드폰번호가리기();
        String str = "01033334444";
        System.out.println(sol.solution(str));
    }
}
