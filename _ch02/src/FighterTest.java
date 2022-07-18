abstract class Unit2 {
	int x, y;
	abstract void move(int x, int y);
	void stop() {System.out.println("멈춥니다.");} 
}

interface Fightable {
	void move(int x, int y);	//public abstract : omitted
	void attack(Fightable f);	//public abstract : omitted
}

class Fighter extends Unit2 implements Fightable {
	//오버라이딩 규칙: 조상(위에 생략된 public)보다 접근제어자가 좁아선 안된다
	public void move(int x, int y) {	
		System.out.println("["+x+","+y+"]로 이동");
	}
	public void attack(Fightable f) {
		System.out.println(f+"를 공격.");
	}
	
	//싸울 수 있는 상대를 불러온다
	Fightable getFightable() { 
		Fighter f = new Fighter(); // Fighter를 생성해서 반환
		return f;
	}
	
}

public class FighterTest {
	public static void main(String[] args) {
		Fighter f = new Fighter();	//call possible
		Fightable f2 = f.getFightable();
//		Unit f = new Fighter(); 	//Unit don't have attack. couldn't call
//		Fightable f = new Fighter();
//		f.move(100,200);
//		f.attack(new Fighter());
	}

}
