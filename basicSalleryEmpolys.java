package problems;
import java.util.*;
public class basicSalleryEmpolys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("enter the employe id number");
    sc .nextLine();
    System.out.println("enter the employe name");
     String name = sc.nextLine();
    System.out.println("enter the employes basic saler");
     float salery=sc.nextFloat();
     float HRA=(salery*50)/100;
     float DA =(salery*10)/100;
     float TA =(salery*40)/100;
     float MA =(salery*30)/100;
     float PF =(salery*5)/100;
     float GS=( salery+HRA+DA+TA+MA);
     float tax = GS*10/100;
     float NS =GS-PF-tax;
     System.out.println("HRA is:"+HRA);
     System.out.println("DA is:"+DA);
     System.out.println("TA is:"+TA);
     System.out.println("MA is:"+MA);
     System.out.println("PF is:"+PF);
     System.out.println("GS is:"+GS);
     System.out.println("tax is:"+tax);
     System.out.println("NS is:"+NS);
     sc.close();
    }  

}