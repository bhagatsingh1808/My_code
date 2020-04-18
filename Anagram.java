import java.io.*;
import java.util.*;

public class Anagram{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S1 = sc.next();
        String S2 = sc.next();
        int c = 0;
        int net = 0;
        int[] freq = new int[26];
        int[] frqcy = new int[26];
        for(int i=0; i<S1.length(); i++){
            freq[S1.charAt(i)-'a']++;
        }
        for(int i=0; i<S2.length(); i++){
            frqcy[S2.charAt(i)-'a']++;
            
        }
        for(int i=0; i<26; i++){
            net = Math.abs(freq[i] - frqcy[i]);
            c = c + net;
        }
        System.out.print(c);
              
    }
}
