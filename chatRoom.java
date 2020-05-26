/*user has recently learned to type and log on to the Internet. He immediately entered a chat room and decided to say hello to everybody. user typed the word s. It is considered that user managed to say hello if several letters can be deleted from the typed word so that it resulted in the word "hello".*/



import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//hello
        String S = sc.next();
        char[] ch = {'h','e','l','l','o'};
        int index = 0;
        int count = 0;
        for(int i=1; i<S.length(); i++){
            if(S.charAt(i)==ch[index]){ 
                count++;
                index++;
                if(index==5){
                    break;
                }
                
            }
            else{
                
            }
                
            }
        if(count==5){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        
    }
}