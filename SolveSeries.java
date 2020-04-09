//Given a series 7,15,32,67.....Find the nth term.

import java.io.*;
import java.util.*;

public class SolveSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] arr = new int[s];
        arr[0]=7;
        for(int i=1; i<s; i++){
            arr[i] = (arr[i-1]*2)+i;
        }
        System.out.println(arr[s-1]);
        
    }
}
