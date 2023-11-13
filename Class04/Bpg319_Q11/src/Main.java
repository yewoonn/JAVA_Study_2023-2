import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int inA, inB, iRes;
		String inOper;
		Scanner oInDev;
		Calc calc;
		
		
		oInDev = new Scanner(System.in);
		inA = oInDev.nextInt();
		inB = oInDev.nextInt();
		inOper = oInDev.next();
		
		
		if(inOper.equals("+")) {
			calc = new Add();
			
		}
		else if(inOper.equals("-")) {
			calc = new Sub();
		}
		else if(inOper.equals("*")) {
			calc = new Mul();
		}
		else{
			calc = new Div();
		}
		
		calc.setValue(inA, inB);
		iRes = calc.calculate();
		
		System.out.println(">> " + iRes);
		

		oInDev.close();
		
	}

}
