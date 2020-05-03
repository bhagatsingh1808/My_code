/*Find the number of different candies a packet has.*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DifferentCandies{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
       int T = sc.nextInt();
        for(int i=0; i<T; i++){
            int count = 0;
            
            String S = sc.next();
            char[] ch = S.toCharArray();
            int[] freq = new int[26];
            for(int j=0; j<S.length(); j++){                              
               freq[S.charAt(j)-'a']++;
            }
            for(int j=0; j<freq.length; j++){
            if(freq[j]!=0){
                
                count = count + 1;
            }
                
            }
            System.out.println(count);
        }
        
    }
}