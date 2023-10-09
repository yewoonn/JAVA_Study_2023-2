import java.util.Scanner;

public class  Star7_2444 {
    public static void main(String[] args) {
        int i, j, iNum, iBlank, iStar;
        Scanner oInDev;

        oInDev = new Scanner(System.in);
        iNum = oInDev.nextInt();

        /*
            iNum이 5일 때 가정
            4 . 1
            3 . 3
            2 . 5
            1 . 7
            0 . 9
            1 . 7
            2 . 5
            3 . 3
            4 . 1
         */

        for(j=0; j< iNum; j++){
            iStar = 2*j + 1;
            iBlank = iNum - (j+1);
            for(i = 0; i < iBlank; i++){
                System.out.print(" ");
            }
            for(i = 0; i < iStar; i++){
                System.out.print("*");
            }   
            System.out.print("\n");
        }


        for(j=0; j< iNum - 1; j++){
            iStar = 2 * (iNum - (j+1)) - 1;
            iBlank = (j+1);
            for(i = 0; i < iBlank; i++){
                System.out.print(" ");
            }
            for(i = 0; i < iStar; i++){
                System.out.print("*");
            }   
            System.out.print("\n");
        }

       
        oInDev.close();
        
    }
}
