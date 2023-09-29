import java.util.Scanner;

public class OvenClock_2525 {
	
    public static void main(String[] args) {

		int iNowHour, iNowMin, iCook, iCookHour, iCookMin;
		Scanner oInDev;
		
		oInDev = new Scanner(System.in);
		
		iNowHour = oInDev.nextInt();
		iNowMin = oInDev.nextInt();
		iCook = oInDev.nextInt();
		
		
		
		iCookHour = iCook/60;
		iCookMin = iCook%60;
		
		iCookHour +=iNowHour;
		iCookMin +=iNowMin;
		
		if(iCookMin >= 60) {
			iCookHour++;
			iCookMin-=60;
		}
		
		
		if(iCookHour >= 24) {
			iCookHour = 0;
		}
		
		
		System.out.print(iCookHour+" "+iCookMin);
		
		oInDev.close();
	}
}
