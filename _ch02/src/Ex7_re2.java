class Tvv {
	boolean power; // ��������(on/off)
	int channel;	// ä��

	void power()       {   power = !power; }
	void channelUp()   {   ++channel;      }
	void channelDown() {   --channel;      }
} //부모의멤버가 5

class SmartTv extends Tvv {  // CaptionTv�� Tv�� ĸ��(�ڸ�)�� �����ִ� ����� �߰�
	boolean caption;     // ĸ�ǻ���(on/off)
	void displayCaption(String text) {
		if (caption) {   // ĸ�� ���°� on(true)�� ���� text�� ���� �ش�.
			System.out.println(text);
		}
	}
} //child member2 + parent member5 = 7

class Ex7_re2 {
	public static void main(String args[]) {
		SmartTv stv = new SmartTv();
		stv.channel = 10;			// 조상 클래스로부터 상속받은 멤버.
		stv.channelUp();			// 조상 클래스로부터 상속받은 멤버.
		System.out.println(stv.channel);
		stv.displayCaption("Hello, World");
		stv.caption = true;	// ĸ��(�ڸ�) ����� �Ҵ�.	       
		stv.displayCaption("Hello, World");
	}
}