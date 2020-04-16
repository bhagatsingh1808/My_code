/* given 3 strings.
1. in first string replace all vowels by $.
2. in second String replace allConsonants by #.
3. in third String convert to uppercase.
*/



import java.io.*;
import java.util.*;

public class StringReplace{

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String S1 = sc.next();
        String S2 = sc.next();
        String S3 = sc.next();
        for(int i=0; i<3; i++){
            if(i==0){
               S1 = S1.replaceAll("[aeiouAEIOU]","\\$");
            }
            else if(i==1){
                S2 = S2.replaceAll("[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]","#");
            }
            else{
                S3 = S3.toUpperCase();
            }
           
        }
         System.out.println(S1+S2+S3);
    }
}