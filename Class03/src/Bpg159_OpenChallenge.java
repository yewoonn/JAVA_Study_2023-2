import java.util.Scanner;

public class Bpg159_OpenChallenge {
    public static void main(String[] args) {
       int iAnswer, iInput, iCnt, iMax, iMin;
       String sAgain;
       Scanner oInDev;

       oInDev = new Scanner(System.in);
       iCnt = 0;
       iMin = 0; 
       iMax = 99;
       iAnswer = (int)(Math.random()*99);

       System.out.println("정답" + iAnswer);
       System.out.println("수를 결정하였습니다. 맞추어 보세요");

       while(true){
            iInput = oInDev.nextInt();
            iCnt++;

            if(iInput < 0 || iInput > 99){
                System.out.println(iCnt+"번째) 범위에 맞는 수를 입력하세요.");
            }
            else{
        
                if(iInput > iAnswer){

                    iMax = iInput -1;
                    System.out.println(iCnt + "번째) 입력값보다 더 작습니다. (" + iMin + " ~ " + iMax+ ")");
                }
                else if(iInput < iAnswer){
                    iMin = iInput + 1;
                    System.out.println(iCnt + "번째) 입력값보다 더 큽니다. (" + iMin + " ~ " + iMax + ")");
                }
                else{
                    System.out.println("맞았습니다.");
                    System.out.println("다시 하겠습니까? (y/n)");
                    sAgain = oInDev.next(); //next와 nextline 차이
                
                    
                    if(sAgain.equals("y")){
                        iAnswer = (int)(Math.random()*99);
                        iCnt =0;
                        iMax = 99;
                        iMin = 0;
                        System.out.println("수를 결정하였습니다. 맞추어 보세요");
                    }
                    else{
                        break;
                    }
                }
            }
       }
       



       oInDev.close();
    }
}
