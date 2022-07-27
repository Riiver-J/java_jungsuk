class Ex8_4 {
	public static void main(String args[]) {	//call main	
		System.out.println(1);			
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(args[0]);	//ArrayIndexOutOfBoundsException.
			System.out.println(4); 	// ������� �ʴ´�.
		} catch (ArithmeticException ae)	{
			if (ae instanceof ArithmeticException) 
				System.out.println("true");	
			System.out.println("ArithmeticException");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException"); // try-catch의끝
			//or catch(Exception e) 모든 예외의 조상이므로 쌉가능. 제일 마지막에 넣어야 함 주의.
		}
		System.out.println(6);
	}	// main�޼����� ��
}