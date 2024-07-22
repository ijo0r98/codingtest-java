package swexpertacademy.Difficulty1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class q2050 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String input = sc.next();

        String alphabet = "0ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i=0; i<input.length(); i++){
            System.out.print(alphabet.indexOf(input.charAt(i))+" ");
        }

    }
}
