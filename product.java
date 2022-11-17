import java.util.*;
public class product {
    public static void main(String[] args) {
        int cp,sp;
        Scanner sc=new Scanner(System.in);
        cp=sc.nextInt();
        sp=sc.nextInt();
        if((sp-cp)>0){
            System.out.println("profit");
        }
        else{
            System.out.println("lose...");
        }
        sc.close();    
    }
    
}
