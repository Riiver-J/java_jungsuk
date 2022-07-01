class Ex3_9 {
	public static void main(String args[]) { 
		int a = 1_000_000;    // 1,000,000   1백만=10의6제곱
		int b = 2_000_000;    // 2,000,000   2백만=10의6제곱
		
		//10의 12제곱이나와야되는데 -1454759936나옴 왜? 오버플로우발생
		//int의 범위는 10의9제곱이니까 a,b둘중하나를 형변환시켜야됨

		long c = (long)a * b;       // a * b = 2,000,000,000,000 ?

		System.out.println(c);
	}
}