import java.util.Scanner;
class Compare_strings{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s1lower = s1.toLowerCase();
        String s2lower = s2.toLowerCase();
         int result = s1lower.compareTo(s2lower);
        if(result==0){
            System.out.println("0");
        }
        else if(result > 0){
            System.out.println("1");
        }
        else{
            System.out.println("-1");
        }
    }
}