
public class Div extends Calc {

	Div(){
		
	}
	
	@Override
	public int calculate() {
		int iRes  = 0;
		
		if(b == 0) {
			iRes = 0;
		}
		
		else{
			iRes = a/b;
		}
		
		return iRes;
	}

}
