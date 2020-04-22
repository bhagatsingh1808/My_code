/* count the munimum number of stones to take out so that no neighbouring stones have same color. */




import java.io.*;
import java.util.*;

public class StonesOnTable{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int count = 0;
        String S = sc.next();
        char[] crr = S.toCharArray();
        for(int i=0; i<T-1; i++){
            if(crr[i]!=crr[i+1]){
                
            }
            else{
                count = count + 1;
            }
        }
        System.out.print(count);
    }
}