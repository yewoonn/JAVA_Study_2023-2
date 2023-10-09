import java.util.Scanner;


public class Bpg165_Q4 {
    public static void main(String[] args) {
        int iNum;
        char cInput;
        Scanner oInDev;

        oInDev = new Scanner(System.in);

        System.out.print("알파벳 소문자를 입력하세요 >> ");
        cInput = oInDev.next().charAt(0); // 문자형 입력 받기

        iNum = (cInput - 97) + 1; // 입력된 알파벳까지의 알파벳 개수(a = 97)
        for(int j = 0; j < iNum; j++ ){
            for(int i = 'a'; i < cInput + 1 - j; i++){
                 System.out.printf("%c", i);
            }
            System.out.print("\n");
        }

        oInDev.close();
    }
}
