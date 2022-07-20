import java.util.*;

class Ex4_11 {
	public static void main(String[] args) { 

		//i=1,2,3,4,5 repeat 5 in{}
//		for(int i=1;i<=5;i++) {
//			System.out.println("**********");			
//		}
		
//		for(int j=1;j<=10;j++) {
//			System.out.print("*"); //without 'ln' 가로로출력
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=10;j++) {
				System.out.print("**");
			}
			System.out.println(); //10개찍고줄바꿔
		}
		
	} // main의끝.
	
	//만약 j<=10을 j=i로 바꾸면 상수가 아니게되므로 i변화와 동일하게 변하면서 찍을수있
}