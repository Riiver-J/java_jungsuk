import java.awt.Point;

class Mypoint {
	int x;
	int y;
}

//class Circle extends Mypoint { //inheritance
//	int r;
//}

class Circle { //composite
	Mypoint p = new Mypoint(); //참조변수의 초기화. 까먹으면안됨.=이후넣는꺼까먹으면p=new Mypoint();별도로 추가해줘
	int r;
}

public class InheritanceTest {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.p.x = 1;
		c.p.y = 2;
		c.r = 3;
		System.out.println("c.p.x="+c.p.x);
		System.out.println("c.p.y="+c.p.y);
		System.out.println("c.r="+c.r);
	}

}
