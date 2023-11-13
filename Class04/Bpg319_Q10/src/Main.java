
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dictionary dic = new Dictionary(10);
		
		dic.put("hwang", "java");
		dic.put("lee", "python");
		dic.put("lee", "c++");
		
		System.out.println(dic.length());
		System.out.println("lee의 값은 " + dic.get("lee"));
		System.out.println("hwang의 값은 " + dic.get("hwang"));
		
		dic.delete("hwang");
		System.out.println(dic.length());
		System.out.println("hwang의 값은 " + dic.get("hwang"));

	}

}
