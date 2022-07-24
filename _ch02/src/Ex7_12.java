class Ex7_12 { 
	class InstanceInner { 
		int iv = 100; 
//		static int cv = 100;            // ����! static������ ������ �� ����. 
		final static int CONST = 100;   // final static�� ����̹Ƿ� ���
	} 

   static class StaticInner { 
		int iv = 200; 
		static int cv = 200;    // staticŬ������ static����� ������ �� �ִ�. 
	} 

	void myMethod() { 
		class LocalInner { 
			int iv = 300; 
//			static int cv = 300;             // ����! static������ ������ �� ����. 
			final static int CONST = 300;    // final static�� ����̹Ƿ� ��� 
		} 
		
		int i = LocalInner.CONST; //ok
	} 

	public static void main(String args[]) { 
		System.out.println(InstanceInner.CONST); 
		System.out.println(StaticInner.cv); 
//		System.out.println(LocalInner.CONST); //nope. 지역내부 클래스의 static상수는 메서드 내에서만 사용가능
	
	} 
}