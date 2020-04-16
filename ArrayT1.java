/* finding the product of all elements of array except a[i]. */


import java.io.*;
import java.util.*;

public class ArrayT1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<=N-1; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<=N-1; i++){
            int multi = 1;
            for(int j=0; j<=N-1; j++){
                if(i!=j){
                   multi = multi*arr[j];
            }
            
            }
            System.out.print(multi + " ");
           
        }
     
        
    }
   
}