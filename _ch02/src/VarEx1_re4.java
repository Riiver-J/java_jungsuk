
public class VarEx1_re4 {

	public static void main(String[] args) {
		int x = 4, y = 2;
		int tmp; //=관계아님주의
		
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println(x);
		System.out.println(y);
	
	}

}
