/* it takes a string input. which represemts  stone of different colors on the table. 
person selects stones randomly. now we have two detect how many different colors of stones are there? */



import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int T = sc.nextInt();
         sc.nextLine();
        int count = 0;
        String S = sc.nextLine();
        char[] c =S.toCharArray();
        for(int i=0; i<c.length-1; i++){
            if(c[i]==c[i+1]){
                count = count+1;
                
            }
            
        }System.out.print(count);
    }
}
