class Ex7_7 {
	public static void main(String args[]) {
		Car car = null;
		FireEngine fe = new FireEngine(); //실제 인스턴스가 무엇인지가 중요.

		FireEngine fe2 = (FireEngine)car; //조상->자손으로 형변환.
		Car car2 = (Car)fe2;			  //자손->조상으로 형변환.
//		car2.drive(); //NullPointerException발생.객체가없으니까.
	}
}

class Car {
	String color;
	int door;

	void drive() { 	// �����ϴ� ���
		System.out.println("drive, Brrrr~");
	}

	void stop() {  	// ���ߴ� ���	
		System.out.println("stop!!!");	
	}
}

class FireEngine extends Car {	// �ҹ���
	void water() {	// ���� �Ѹ��� ���
		System.out.println("water!!!");
	}
}