
import java.io.*;
import java.util.*;

public class Pattern{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        for (int j=0; j<col; j++){
             
         for(int i=0; i<row; i++){
             if(j!=0 && j!=col-1){
                 if(i!=0 && i!=row-1){
                     System.out.print(" ");
                 }
                 else{
                     System.out.print("1");
                 }
                
             }
             else{
                 System.out.print("1");
             }
         }
            System.out.println("");
        }
    }
}