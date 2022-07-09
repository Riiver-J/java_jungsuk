class Ex6_1 { 
	public static void main(String args[]) { //메인메서드랑 이름 동일하게
		Tv t;                 // Tv인스턴스를 참조하기위한 변수t를선언      
		t = new Tv();         // Tv인스턴스를 생성 
		t.channel = 7;        // Tv인스턴스의 멤버변수 channel의 값을 7로함 
		t.channelDown();      // Tv인스턴스의 메서드 channelDown()을 호출 
		System.out.println("현재 채널은 " + t.channel + " 입니다."); 
	} 
}

class Tv { 
	// Tv�� �Ӽ�(�������)   
	String color;           // ���� 
	boolean power;         	// ��������(on/off) 
	int channel;           	// ä�� 

	// Tv�� ���(�޼���) 
	void power()   { power = !power; }  // TV�� �Ѱų� ���� ����� �ϴ� �޼���  
	void channelUp()   {  ++channel; }  // TV�� ä���� ���̴� ����� �ϴ� �޼��� 
	void channelDown() { --channel; }   // TV�� ä���� ���ߴ� ����� �ϴ� �޼���  
}