import java.util.Scanner;

public class Bpg168_Q13 {
    public static void main(String[] args) {
        int iNum, i10Div, i10Mod;
        Scanner oInDev;
     
     
        while(true){
          oInDev = new Scanner(System.in);

          iNum = oInDev.nextInt();

          if(iNum == 0){
               break;
          }

          i10Div = iNum/10; // 9
          i10Mod = iNum%10; // 3

          System.out.print("박수 ");
       
          if(i10Div != 0 && i10Div % 3 == 0){
               System.out.print("짝");
          }
          if(i10Mod != 0 && i10Mod % 3 == 0){
               System.out.print("짝");
          }
          
          System.out.print("\n");

          }
     
          oInDev.close();   

    }
     
}
