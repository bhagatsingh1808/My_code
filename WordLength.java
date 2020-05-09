/*: we write down the first and the last letter of a word and between long words we write the number of letters between the first and the last letters. That number is in decimal system and doesn't contain any leading zeroes.

Thus, "localization" will be spelt as "l10n", and "internationalization» will be spelt as "i18n".*/





import java.io.*;
import java.util.*;

public class WordLength{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            String S = sc.next();
            char[] ch = S.toCharArray();
            if(S.length()>=12){
                int l = S.length()-2;
                
                System.out.print(ch[0]);
                System.out.print(l);
                System.out.print(ch[S.length()-1]);
                System.out.println();
            }
            else{
                System.out.println(S);
            }
        }
    }
}
