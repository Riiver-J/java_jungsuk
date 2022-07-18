public class Ex7_10 {
	public static void main(String[] args) {
		Unit[] group = { new Marine(), new Tank(), new Dropship() }; //아래 네줄을 한줄로 합친것
//		Unit[] group = new unit[3];			
//		group[0] = new Marine();
//		group[1] = new Tank();
//		group[2] = new Dropship();
		
		
		
		for (int i = 0; i < group.length; i++)
			group[i].move(100, 200);
	}
}

abstract class Unit {
	int x, y;
	abstract void move(int x, int y);
	void stop() { /* ���� ��ġ�� ���� */ }
}

class Marine extends Unit { // ����
	void move(int x, int y) {
		System.out.println("Marine[x=" + x + ",y=" + y + "]");
	}
	void stimPack() { /* �������� ����Ѵ�. */ }
}

class Tank extends Unit { // ��ũ
	void move(int x, int y) {
		System.out.println("Tank[x=" + x + ",y=" + y + "]");
	}
	void changeMode() { /* ���ݸ�带 ��ȯ�Ѵ�. */ }
}

class Dropship extends Unit { // ���ۼ�
	void move(int x, int y) {
		System.out.println("Dropship[x=" + x + ",y=" + y + "]");
	}
	void load()   { /* ���õ� ����� �¿��. */ }
	void unload() { /* ���õ� ����� ������. */ }
}