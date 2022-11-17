import java.util.*;
public class multipleIfElse {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("2.sweets");
        System.out.println("3.cloclate");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        if(choice==1){
            System.out.println("drinks");
        }
        else if(choice==2){
            System.out.println("sweets");

        }
        else if(choice==3){
            System.out.println("coclate");

        
        }else{
            System.out.println("wromg choise");
            sc.close();
        }
    }
    
}
