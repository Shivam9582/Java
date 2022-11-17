package problems;
import java.util.*;
public class DigitChar {
    public static void main(String[] args) {
        System.out.println("enter the any key");
        Scanner sc = new Scanner (System.in);
        char s = sc.nextLine().charAt(0);
        if(s>='A'&&s<='Z'||s>='a'&&s<='z'){
            System.out.println("this is the char");
        }else if(s>='0'&&s<= '9'){
            System.out.println("this number is numric");
        }else{
            System.out.println("special character");
        }
    }
    
}
