package problems;
import java.util.*;
public class UpperLower {
    public static void main(String[] args) {
        System.out.println("enter the charactr");
        Scanner sc=new Scanner(System.in);
        char s =sc.nextLine().charAt(0); 
        if(s>='A'&&s>='Z'){
            System.out.println("the lower case");
        } else{
            System.out.println(" the upper case");
            sc.close();
        }
    }
    
}
