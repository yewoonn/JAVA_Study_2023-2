import java.util.Scanner;

public class Bpg386_Q8 {

    public static void main(String[] args) {
        Scanner oInDev = new Scanner(System.in);

        System.out.println("문자열을 입력하세요. 빈칸이나 있어도 되고 영어 한글 모두 됩니다.");
        String sIn = oInDev.nextLine();
        String sOther;
        String sOne;

        for(int i=0; i < sIn.length(); i++){
            sOne = sIn.substring(0,1);
            sOther = sIn.substring(1, sIn.length());
            sIn = sOther.concat(sOne);

            System.out.println(sIn);
        }

        oInDev.close();

    }
}
