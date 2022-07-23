class AAA {	//AAA is outclass of BBB
	int i = 100;
	BBB b = new BBB();
	
	class BBB {	//BBB is inner class of AAA
		void method() {
//			AAA a = new AAA();
//			System.out.println(a.i);
			System.out.println(i);	//inner class가 됐으니 윗 두줄처럼 할필요 없음. 객체생성없이 외부클래스의 멤버에 접근 가능
		}
	}
} 


//class CCC {	//CCC에선 BBB에 접근 못하게 됨 
//	BBB b = new BBB();
//} 

public class InnerTest {

	public static void main(String[] args) {
//		BBB b = new BBB();	//BBB가 더이상 독립적인 객체가 아니라서 이렇게 따로 호출 못함
//		b.method();
	}

}
