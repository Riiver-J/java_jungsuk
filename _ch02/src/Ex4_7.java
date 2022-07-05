class Ex4_7 {
	public static void main(String args[]) {
		int num = 0;

		// for란? 괄호{} 안의 내용을 20번 반복한다.
		// 퀴즈. 1~10사이의 난수를 20개 출력하시오.
		// 1,2,3,4,5,6,7,8,9,10 총10개라서 10곱해주는것
		for (int i = 1; i <= 20; i++) {
//			System.out.println(Math.random()); //0.0<=x<1.0
//			System.out.println(Math.random()*10); //0.0<=x<10.0
//			System.out.println((int)(Math.random()*10)); //0<=x<10 괄호주의,하지만0~9인상태
//			System.out.println((int)(Math.random()*10)+1); //1<=x<11 괄호주의,1~10도출
		// 퀴즈.	-5~5사이의 난수를 20개 출력하시오.
		// -5,-4,-3,-2,-1,0,1,2,3,4,5 총11개라서 11곱해주는것
//			System.out.println((int)(Math.random()*11)); //0<=x<11, 0~10
			System.out.println((int)(Math.random()*11)-5); //-5<=x<6, -5~5
			
		}
	}
}