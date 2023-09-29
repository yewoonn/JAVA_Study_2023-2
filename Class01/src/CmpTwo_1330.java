import java.util.Scanner;

public class CmpTwo_1330 {
	
    public static void main(String[] args) {
		int iInputA, iInputB;
		Scanner oInDev;
	
		oInDev = new Scanner(System.in);
		
		iInputA = oInDev.nextInt();
		iInputB = oInDev.nextInt();

		if(iInputA > iInputB) {
			System.out.print(">");
		}
		else if(iInputA < iInputB) {
			System.out.print("<");
		}
		else {
			System.out.print("==");
		}
		
		oInDev.close();
	}
}
