import java.util.Scanner;
 
public class AlarmClock_2884 {

    public static void main(String[] args) {
		int iHour, iMin;
		int iNowTime, iSetTime;
		Scanner oInDev;
		
		oInDev = new Scanner(System.in);
		
		iHour = oInDev.nextInt();
		iMin = oInDev.nextInt();

		
		iNowTime = iHour*60 + iMin;
		iSetTime = iNowTime - 45;
		
		if(iSetTime >= 0) {
			iHour = iSetTime/60;
			iMin = iSetTime%60;
		}
		else {
			iHour = 23;
			iMin = 60+iSetTime;
		}
		
		System.out.print(iHour+" "+iMin);
		
		
		oInDev.close();
	}
}
