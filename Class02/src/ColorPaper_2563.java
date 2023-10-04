import java.util.Scanner;

public class ColorPaper_2563 {
    public static final int SIZE = 100;
    public static void main(String[] args) {
        int [][]iCoorARR ;
        int iPaperNo, iSize, iXLoop ,iYLoop, iX, iY, i, j;
        Scanner oInDev;

        iCoorARR = new int [SIZE][SIZE];
        oInDev = new Scanner(System.in);

        iSize = 0;
        iPaperNo = 0;
        iX = 0;
        iY = 0;

        iPaperNo = oInDev.nextInt();

        //검은 색 영역 설정
        for(int k = 0; k < iPaperNo; k++){
            iX = oInDev.nextInt();
            iY = oInDev.nextInt();
            
            if( iX>90 || iY>90 ){
                k--;
                continue;
            }

            for(j=0; j<10; j++){
            iYLoop = j + iY;
                for(i = 0; i < 10; i++){
                    iXLoop = i + iX;
                    iCoorARR[iYLoop][iXLoop] = 1;
                }
            }


        }

        

        //전체 넓이 구하기
        for(j=0; j<100; j++){
            for(i = 0; i < 100; i++){
                if(iCoorARR[j][i]==1){
                    iSize++;
                }
            }
        }

        System.out.println(iSize);

        

        oInDev.close();


    }
}    
    
    


