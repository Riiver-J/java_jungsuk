import javax.net.ssl.CertPathTrustManagerParameters;

public class Ex2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int x = 4, y = 2;
	int tmp;		//	이걸빼먹어서 오류났
		
	tmp = x;
	x = y;
	y = tmp;
	
	System.out.println("x="+x); //+는숫자앞에글자를 붙일때도 사
	System.out.println("y="+y);
	}

}
