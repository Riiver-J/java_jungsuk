class MyPoint4 extends Object {
	int x;
	int y;
	
	MyPoint4(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//Object클래스의 toString()를 오버라이딩
	public String toString() {
		return "x:"+x+", y:"+y;
	}
}

public class toStringTest {
	public static void main(String[] args) {
		MyPoint4 p = new MyPoint4(1,2);
		System.out.println(p);
		
		//MyPoint4 p = new MyPoint4();
		//p.x = 3;
		//p.y = 5;
		//System.out.println("p.x="+p.x);
		//System.out.println("p.y="+p.y); 를간단히표현가능
	}

}
