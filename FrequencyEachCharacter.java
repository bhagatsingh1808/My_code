import java.io.*;
import java.util.*;

public class FrequencyEachCharacter{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S1 = sc.next();
        String S2 = sc.next();
        int[] freq = new int[S1.length()];
        int[] frqcy = new int[S2.length()];
        char[] c1 = S1.toCharArray();
        char[] c2 = S2.toCharArray();
        for(int i=0; i<=c1.length-1; i++){
            freq[i] = 1;
            for(int j=i+1; j<=c1.length-1; j++){
                if(c1[i]==c1[j]){
                    freq[i]++;
                    c1[j]=0;
                }
            
            
            }
        }
       for(int k=0; k<c2.length; k++){
            frqcy[k]=1;
            for(int l=k+1; l<c2.length; l++){
                if(c2[k]==c2[l]){
                    frqcy[k]++;
                    c2[l]=0;
                }
            }
        }
        for(int i=0; i<=freq.length-1; i++){
            if(c1[i]!=' ' && c1[i]!=0 ){
            System.out.println(freq[i]+ " " + c1[i]);
        }
        }
            System.out.println("-----");
          for(int k=0; k<=frqcy.length-1; k++){
            if(c2[k]!=' ' && c2[k]!=0 ){
            System.out.println(frqcy[k]+ " " + c2[k]);
        }
          
        
        }
       
    }
}