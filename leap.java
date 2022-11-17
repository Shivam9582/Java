import java.util.*;
public class leap {
    public static void main(String[] args) {
        //int year;
      // System.out.println("enter the value");
        Scanner s=new Scanner(System.in);
          int year=s.nextInt();
        
        if(year%4==0){ 
            System.out.println(" leap");
        }else{
            System.out.println("not leap year");
        }
        s.close();

    }
    
}
