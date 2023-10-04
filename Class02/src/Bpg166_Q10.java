public class Bpg166_Q10 {
    public static final int SIZE = 4;

    public static void main(String[] args) {
        int [][] iNumARR;
        int i, j, iCnt, iRanLo, iRanNo, iRow, iCol;

        iNumARR = new int [SIZE][SIZE];
        iCnt = 0;

        //임의의 숫자 저장
        while(iCnt < 6){
            iRanNo = (int)(Math.random()*10)+1;
            iRanLo = (int)(Math.random()*16);
            //System.out.println("랜덤 숫자 > "+iRanNo + " , 랜덤 장소 > " + iRanLo);
            
            iRow = iRanLo/SIZE;
            iCol = iRanLo%SIZE;

            if(iNumARR[iRow][iCol] == 0){
                iNumARR[iRow][iCol] = iRanNo;
                iCnt++;
            }
            
        }

        //4X4 이차원 배열 출력
        for(j=0; j < SIZE; j++) {
            for(i = 0; i < SIZE; i++){
            System.out.print(iNumARR[j][i] + " ");
            }
            System.out.print("\n");
        }
        
    }
}
