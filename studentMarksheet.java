package problems;
import java.util.*;
public class studentMarksheet {
    public static void main(String[] args) {
        System.out.println("enter the Roll No.");
        Scanner sc =new Scanner(System.in);
        int  Roll = sc.nextInt();
        System.out.println("enter the name");
        int  name =sc.nextInt();
        System.out.println("enter the number phys :");
        int phys =sc.nextInt();
        System.out.println("enter the number maths:");
        int maths =sc.nextInt();
        System.out.println("enter the number chem:");
        int chem = sc.nextInt();
         float total =phys+ maths+chem;
         System.out.println("marks is:"+ total);
         float percentage = total/3;
        System.out.println("total percentage:"+percentage);
        if(90>=percentage){
            System.out.println("grade is A");
        }else if( percentage<=70&&percentage<=60){
            System.out.println("grade B");
        }else{
            System.out.println("grade is C");
            sc.close();
            
        
        }
    }
    
}
