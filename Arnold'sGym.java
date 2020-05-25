/*Arnold now only does three types of exercises: "chest" exercises, "biceps" exercises and "back" exercises. Besides, his training is cyclic, that is, the first exercise he does is a "chest" one, the second one is "biceps", the third one is "back", the fourth one is "chest", the fifth one is "biceps", and so on to the n-th exercise.
The first line contains integer n . The second line contains n integers a1,?a2,?...,?an — the number of times Greg repeats the exercises.
Print word "chest" (without the quotes), if the chest gets the most exercise, "biceps" (without the quotes), if the biceps gets the most exercise and print "back" (without the quotes) if the back gets the most exercise.*/







import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int chest = 0;
        int biceps = 0;
        int back = 0;
        int[] arr = new int[n+2];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length-2; i++ ){ 
            chest = chest + arr[i];
            biceps = biceps + arr[i+1];
            back = back + arr[i+2];
            i=i+2;
        }
        if(chest>biceps && chest>back){//5 1 10
            System.out.println("chest");
        }
        else if(biceps>chest && biceps>back){
            System.out.println("biceps");
        }
        else{
            System.out.println("back");
        }
        
           }
}