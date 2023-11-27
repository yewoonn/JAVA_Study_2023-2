import java.util.Random;
import java.util.Vector;
import java.util.Scanner;

public class EnglishTest {
    private static final int iChoiceNum = 4;
    public static void main(String[] args) {
        int iAns, iQWordIdx,iCnt, iChoiceIdx, iUserAns;
        int[] iChoiceChec;
        Scanner oInDev = new Scanner(System.in);
        Vector<Word> TestWord = new Vector<Word>();
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());
        
        //영어 단어 저장
        Word w = new Word("cat", "고양이");
        TestWord.add(w);

        w = new Word("bear", "곰");
        TestWord.add(w);
       
        w = new Word("dog", "개");
        TestWord.add(w);

        w = new Word("rabbit", "토끼");
        TestWord.add(w);

        w = new Word("snake", "뱀");
        TestWord.add(w);

        w = new Word("human", "인간");
        TestWord.add(w);

        System.out.println("\"명품 영어\"의 단어 테스트를 시작합니다. -1을 입력하면 종료합니다.");
        System.out.println("현재 "+TestWord.size()+"개의 단어가 들어 있습니다.");

        //보기 문제 반복
        while(true){
            iChoiceChec = new int[TestWord.size()]; //중복 확인용
            iQWordIdx = random.nextInt(TestWord.size()-1); //인덱스로
            iChoiceChec[iQWordIdx]++;
       
            iAns = random.nextInt(iChoiceNum-1) + 1; //보기 중 정답 선지 번호(1~4)

            System.out.println(TestWord.get(iQWordIdx).getEng()+"??");
            for(int i = 0; i < iChoiceNum; i++){
                iCnt = i + 1;
                if(iCnt == iAns){
                    System.out.print("("+iCnt +")"+TestWord.get(iQWordIdx).getKor()+" ");
                }
                else{
                    while(true){
                        iChoiceIdx = random.nextInt(TestWord.size()); //-1하면 안됨 왜?
                        if(iChoiceChec[iChoiceIdx] == 0){
                            System.out.print("("+iCnt +")"+TestWord.get(iChoiceIdx).getKor()+ " ");
                            iChoiceChec[iChoiceIdx]++;
                            break;
                        }
                    }
                }
           }

            System.out.print(" >> ");
            iUserAns = oInDev.nextInt();
            if(iUserAns == iAns){
                System.out.println("excellent!");
            }
            else if(iUserAns == -1){
                System.out.println("\"명품 영어\"를 종료합니다...");
                break;
            }
            else{
                System.out.println("No!");
            }
        }
        
        oInDev.close();
    }
}
