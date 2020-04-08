import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class FootballPatternMatcher {

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String in = sc.nextLine();
       Pattern P = Pattern.compile("(1111111)|(0000000)");
       Matcher matcher = P.matcher(in);
       if(matcher.find()){
           System.out.println("YES");
       }
       else{
           System.out.println("NO");
       }