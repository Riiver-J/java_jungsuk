
public class VarEx3_re1 {

	public static void main(String[] args) {
		
		//초기화와 선언을 한줄에(soso)
		final int score = 100;
//		score = 200;	//final붙여서 상수처리했으니 다른값은 저장못함.
		System.out.println(score);
		
		//초기화와 선언을 따로따로(good)
		final int grade;
		grade = 200;
		System.out.println(grade);
	}

}
