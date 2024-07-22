package swexpertacademy.Difficulty1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class q2050_v2 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String input = sc.next();

        int a = (int)'A';
        Map<String,Integer> alphabetMap = new HashMap<>();
        for(int i=0; i<26; i++) {
            alphabetMap.put(Character.toString((char)(i+a)), i+1);
        }
        for(int i=0; i<input.length(); i++){
            System.out.print(alphabetMap.get(Character.toString(input.charAt(i)))+" ");
        }

    }
}
