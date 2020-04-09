/* there are monkeys and some bananas to be distributed. so that each monkey get its desires amount of bananas.
now determine whether bananas would be sufficient or not.
1st line contains test cases.
second line contain N and C. and third line contain AK.
*/


import java.io.*;
import java.util.*;

public class MonkeyAndBananas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();                    //T = no. of testcases
        for (int i=1; i<=T; i++){
            int N = sc.nextInt();               //N = no.of Monkeys
            int C = sc.nextInt();               //C = NO. of bananas
            int count = 0;
            int[] AK = new int[N];              //AK = no. of bananas per monkey
            for (int j=0; j<N; j++){
                 AK[j] = sc.nextInt();
                 count = count + AK[j];
            }
            if(C>=count){                   
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
            
        }
        
    }
}