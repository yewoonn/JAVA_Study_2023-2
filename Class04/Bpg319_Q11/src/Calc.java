
public abstract class Calc {
	public int a = 0 , b = 0;

	Calc(){
		
	}
	
    public void setValue(int a, int b) {
    	this.a = a;
    	this.b = b;
    }
    
    public abstract int calculate();
}
