import java.util.Scanner;

public class ThreeDice_2480 {
	public static void main(String[] args) {
		int iN1, iN2, iN3;
		int i12, i23, i13;
		int iNum;
		int iMax, iSame;
		int iMoney;
		
		Scanner oInDev;
		oInDev = new Scanner(System.in);
		
		iNum = 0;
		iSame = -1;
		
		iN1 = oInDev.nextInt();
		iN2 = oInDev.nextInt();
		iN3 = oInDev.nextInt();
		

		i12 = iN1 - iN2;
		i23 = iN2 - iN3;
		i13 = iN1 - iN3;

		if (i12 == 0) {
			iNum += 1;
		}
		if (i23 == 0) {
			iNum += 1;
		}
		if (i13 == 0) {
			iNum += 1;
		}

		if (iNum == 0) {
			//같은 눈 X
			if (iN1 > iN2) {
				if (iN1 > iN3) {
					iMax = iN1;
				}
				else {
					iMax = iN3;
				}
			}
			else {
				if (iN2 > iN3) {
					iMax = iN2;
				}
				else {
					iMax = iN3;
				}
			}
			iMoney = iMax * 100;
		}
		else if (iNum == 1) {
			//같은 눈 2개
			if (i12 == 0) {
				iSame = iN1;
			}
			if (i23 == 0) {
				iSame = iN2;
			}
			if (i13 == 0) {
				iSame = iN3;
			}
			iMoney = 1000 + (iSame * 100);
		}
		else {
			//같은 눈 3개
			iSame = iN1;
			iMoney = 10000 + (iSame * 1000);
		}

		System.out.print(iMoney);

		oInDev.close();
	}
}
