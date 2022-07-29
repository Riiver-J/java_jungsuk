public class VarEx3_re2 {

	public static void main(String[] args) {
		final int score = 100;
		boolean power = true;
		System.out.println(power);
		
		byte b = 127; //byte는 -128~127까지니까 
		
		int oct = 010; //접두사0이 붙음->8진수, 10진수로는8	
		int hex = 0x10; //접두사0x 붙음 ->16진수, 10진수로는16	
		
		//8진수나 16진수로 출력하려면 printf를사용해야됨 
		System.out.println(oct);
		System.out.println(hex);
		
		long l =  10000000000L; //int최대값이 10억이므로 넘어서는 숫자는 리터럴접미사로 L붙여줘야
		
		float f = 3.14f; //생략불가.
		double d = 3.14; //접미사 생략가능. but디폴트인것 기억하기. f붙여도 에러발생안함 왜? 그릇(d)이더크니까
		System.out.println(10.);
		System.out.println(.10);
		System.out.println(10f); //접미사는출력안됨
		System.out.println(1e3);
	}
}