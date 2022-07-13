class Data_1 {
	int value;
//	Data_1() {} //생성자가 없기때문에 컴파일러가 알아서 넣어줌.	
}

class Data_2 {
	int value;
	
	Data_2() {}
	Data_2(int x) {   // �Ű������� �ִ� ������.
		value = x;
	}
}

class Ex6_11 {
	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2(); // compile error�߻�
	}
}