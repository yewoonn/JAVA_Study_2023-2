import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;


public class Bpg434_Q1 {
    public static void main(String[] args) {
        int iMax = 0, iCurr = 0; //Integer로 안해도 되나?
        int iIn;
        Scanner oInDev;

        oInDev = new Scanner(System.in);
        Vector<Integer> v = new Vector<Integer>();   

        System.out.print("정수(-1 입력되기 전까지) : ");
        while(true){
            iIn = oInDev.nextInt();

            if(iIn == -1){
                break;
            }
            v.add(iIn);
        }
        
        Iterator<Integer> it = v.iterator(); //Vector 설정 완료 후 생성
        
        iMax = v.elementAt(0);
        while(it.hasNext()){
            iCurr = it.next();
            if(iCurr > iMax){
                iMax =  iCurr;
            }
        }

        System.out.println("가장 큰 수는 "+iMax);

        oInDev.close();
    }
}
