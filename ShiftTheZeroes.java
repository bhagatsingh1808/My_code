/* if the give array = {1,4,5,6,0,3,0,5,} it should be changed into {1,4,5,6,3,5,0,0} without brackets and commans. without swapping.*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int rest;
        int T = sc.nextInt();
       // int N = sc.nextInt();
        int[] arr = new int[T];
        for(int i=0; i<T; i++){
            arr[i]=sc.nextInt();
            
        }
        int[] newarr = new int[T];
        for(int i=0,j=0; i<arr.length; i++){
                if(arr[i]!=0){
                    newarr[j]=arr[i];
                    count = count + 1;
                    System.out.print(newarr[j] + " ");
                    
                    j++;
                    
                }
            
            }
        rest = T-count;
        for (int k=0; k<rest; k++){
            System.out.print("0"+" ");
        }
      
       
        
        
    }
}