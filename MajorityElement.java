/* Find the majority element in the array. A majority element in an array A of size N is an element that appears more than N/2 times in the array.*/


import java.io.*;
import java.util.*;

public class MajorityElement{

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int count = 0;
        int[] arr = new int[T];
        int[] brr = new int[T];
        int[] crr = new int[1];
        for(int i=0; i<T; i++){
            arr[i]=sc.nextInt();
            
        }
        for(int i=0; i<T; i++){
             brr[i] = 1;
            for(int j=i+1; j<T; j++){
               if(arr[i]!=0){
                if(arr[i]==arr[j]){
                    count = count + 1;
                    brr[i]++;
                    arr[j] = 0;
                }
               }
            }
        }
        for(int i=0; i<T; i++){
            if(brr[i]>T/2){
                crr[0] = arr[i];
            }
            
        }
        if(crr[0]>0){
            System.out.print(crr[0]);
        }
        else{
            System.out.print("-1");
        }
        
       
    }
}