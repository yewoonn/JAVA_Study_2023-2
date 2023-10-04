import java.util.Scanner;

public class Bpg166_Q8 {
    public static void main(String[] args) {
        int iSize = -1;
        int iCnt = 0, iRanNum, j;
        int []iRanARR;
        Scanner oInDev;

        oInDev = new Scanner(System.in);

        
        System.out.print("정수 몇 개를 저장할까요? ( 1 ~ 100 사이의 수를 입력하세요) >> ");
        iSize = oInDev.nextInt();
        
        while(iSize < 0 || iSize > 100){
            System.out.print("1~100사이의 정수를 입력하세요 >> ");
            iSize = oInDev.nextInt();
        }

        iRanARR = new int[iSize];

        /*
        System.out.print("현재 배열 >>");
        for(int i = 0; i< iSize; i++){
            System.out.print(iRanARR[i] + " ");
        }
        System.out.print("\n");
        */
        
        
        while(iCnt < iSize){

            iRanNum = (int)(Math.random()*100) + 1;
            //System.out.print(iRanNum +" ");

            for(j = 0; j < iCnt; j++){ 
                if(iRanARR[j] == iRanNum){
                    //System.out.print(iRanNum + " ");
                    break;
                }
            }
            
            if(j == iCnt || iCnt == 0){
                iRanARR[iCnt] = iRanNum;
                iCnt++;
            }

        }

        System.out.print("저장된 배열 >>");
        for(int i = 0; i< iSize; i++){
            System.out.print(iRanARR[i]+ " ");
        }

    
         oInDev.close();
    
    }
}
