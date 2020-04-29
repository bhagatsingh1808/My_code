import java.io.*;
import java.util.*;

public class Bit{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int count  = 0;
        for(int i=0; i<T; i++){
            
            String S = sc.next();
            char[] ch = S.toCharArray();
            if(ch[1]=='+'){
                count = count + 1;
                
            }
            else{
                count = count - 1;
            }
      
        } System.out.print(count);
    }
}