class Ex6_2_re {
	public static void main(String args[]) {
		Tv t1 = new Tv();  // Tv t1; t1 = new Tv();�� �� �������� ����
		Tv t2 = new Tv();
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");

		t1.channel = 7;    // channel ���� 7���� �Ѵ�.
		System.out.println("t1�� channel���� 7�� �����Ͽ����ϴ�.");

		t2 = t1; //참조변수 t1값을 t2에 저
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");
	}
}