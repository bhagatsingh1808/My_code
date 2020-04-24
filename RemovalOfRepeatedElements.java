import java.io.*;
import java.util.*;

public class RemovalOfRepeatedElements{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  S = sc.next();
        char[] ch = S.toCharArray();
        for(int i=0; i<S.length()-1; i++){
           
                if(ch[i]==ch[i+1]){
                    ch[i] = 0;
                }
            
            
        }
        for(int i=0; i<S.length(); i++){
            if(ch[i]!=0){
                System.out.print(ch[i]);
            }
        }
    }
}