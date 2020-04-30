/* a thief has stolen rohit's bag and rohit has informed the cops. there are 100 houses starting from 1 in a straight line. cops run at x m/sec. and searches for y minutes. how many houses are safe for theif. */





import java.io.*;
import java.util.*;

public class TheifAndCops{

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int h ;
        int upper;
        int count;
        int lower;
        int T = sc.nextInt();
        for (int i=1; i<=T; i++){
            count = 0;
            int M =sc.nextInt();
            int[] a = new int[M];
            int[] b = new int[100];
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int j=0; j<M; j++){
                a[j]=sc.nextInt();      
            }
            h = (x*y);
            for(int j=0; j<M; j++){
                upper = a[j]+h;
                if(upper>100){
                    upper = 100;
                }
                lower = a[j]-h;
                if(lower<0 || lower<=1){
                    lower = 0;
                }
                if(lower!=0 && lower!=1){
                    lower = lower - 1;
                }
                    for(int k= lower; k<upper; k++){            
                                b[k]=1;
                    
                        
                }
                
            }
        for(int k=0; k<100; k++){
                    if(b[k]!=1){
                        count = count+1;
                    }
            
        } 
            System.out.println(count);
        }
}
}
