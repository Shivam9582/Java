package problems;
import java.util.*;
public class vowel {
    public static void main(String[] args) {
        System.out.println("enter the elphabate");
        Scanner sc=new Scanner(System.in);
         char s=sc.nextLine().charAt(0);
        if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u'){
            System.out.println("this is the vowels");

        }else if(s=='A'||s=='E'||s=='I'||s=='O'||s=='u'){
            System.out.println("this is the vowesl");

        }else{
            System.out.println("this is not vowels");
            sc.close();
        }

    }   
}
    

