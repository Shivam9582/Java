//import javax.swing.plaf.synth.SynthDesktopIconUI;
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        //int n =21;
        if(n>=18){
            System.out.println("applicable");

        }else{
            System.out.println("not applicable");
            sc.close();
        }
    }
    
}
