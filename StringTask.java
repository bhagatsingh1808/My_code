import java.io.*;
import java.util.*;

public class StringTask{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Str = sc.nextLine();
        String S = Str.toLowerCase();
        S = S.replaceAll("([aeiou])","");
        char[] a = S.toCharArray();
        for(int i=0; i<a.length; i++){
            if(a[i]!='a' || a[i]!='e' || a[i]!='i' || a[i]!='o' || a[i]!='u'){
                System.out.print("." + a[i]);
            }
        }
    }