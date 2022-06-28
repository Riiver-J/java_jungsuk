
public class PintEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(10/3); //정수나누기정수라서정수나옴
//		System.out.println(10.0/3); //실수로바꿔주면실수값나
		
//		System.out.printf("%d%n", 15);
//		System.out.printf("%#o%n", 15);
//		System.out.printf("%#x%n", 15);
//		System.out.printf("%s", Integer.toBinaryString(15));
		
//		float f = 123.456789f;
//		System.out.printf("%f%n", f); //float는 정밀도가 7자리
		
//		double f = 123.456789; //float와는다르게f안붙
//		System.out.printf("%f%n", f);
//		System.out.printf("%e%n", f);
//		System.out.printf("%g%n", f);
		
		System.out.printf("[%5d]%n", 1234567); //자리수지정
		System.out.printf("[%-5d]%n", 10); //왼쪽정렬
		System.out.printf("[%05d]%n", 10); //공백대신0
		System.out.printf("[%05d]%n", 10);
		
		double d = 1.23456789;
		System.out.printf("%.6f%n", d);
		
		System.out.printf("[%s]%n", "www.codechobo.com");
		System.out.printf("[%20s]%n", "www.codechobo.com");
		System.out.printf("[%-20s]%n", "www.codechobo.com");
		System.out.printf("[%.10s]%n", "www.codechobo.com"); //일부만잘라서10자
		
	}

}
