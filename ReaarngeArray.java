import java.io.*;
import java.util.*;

public class ReaarangeArray{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] arr = new int[T+1];
        for(int i=0; i<T; i++){
            arr[i]=sc.nextInt();
        }
            if(T%2==0 && T%3==0){
            for(int i=0; i<T-1; i++){
                
                if(arr[i]>arr[i+1]){
                    int temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                    if(arr[i+1]<arr[i+2]){
                        temp = arr[i+2];
                        arr[i+2] = arr[i+1];
                        arr[i+1] = temp;
                    }
                    else{
                    }
                }
                else if(arr[i+1]<arr[i+2]){
                    int temp = arr[i+2];
                        arr[i+2] = arr[i+1];
                        arr[i+1] = temp;  
                }
                else{   
                }
                i =i+1;
            }
        }

        else{
                for(int i=0; i<T-1; i++){ 
                    if(arr[i]>arr[i+1]){
                    int temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                    if(arr[i+1]<arr[i+2]){
                        temp = arr[i+2];
                        arr[i+2] = arr[i+1];
                        arr[i+1] = temp;
                    }
                    else{
                    }
                }
                else if(arr[i+1]<arr[i+2]){
                    int temp = arr[i+2];
                        arr[i+2] = arr[i+1];
                        arr[i+1] = temp;  
                }
                else{   
                }
                i =i+1;
            }
        }
        
        for(int i=0; i<arr.length-1; i++){
            
                System.out.print(arr[i] + " ");
            
            
        }

}
}