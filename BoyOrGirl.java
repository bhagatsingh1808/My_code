/* IF NUMBER OF DIFFERENT CHARACTERS ARE EVEN THEN IT IS GIRL OTHERWISE BOY. */



import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int count = 0;
        String a = "";
        for(int i = 0; i<S.length(); i++){
            if(a.contains(String.valueOf(S.charAt(i)))){
                //count = count + 1;
            }
            else{
                a = a + S.charAt(i);
            }
        }
        int net = a.length();
        if(net%2==0){
           System.out.print("CHAT WITH HER!");
       }
        else{
            System.out.print("IGNORE HIM!");
        }
    }
}