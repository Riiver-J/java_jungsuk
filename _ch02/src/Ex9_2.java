class Person {
	long id; //원래 이름이 this.id

	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) //형변환앞에! -> else부분없앨 수 있음 & return부분 바뀜.
			return false;
//			return id ==((Person)obj).id;
//		else
//			return false;
		
		Person p = (Person)obj;
		return this.id == p.id; //Person이 자기id(this.id)와 매개변수로 들어온 Person객체(p) id를 비교함.
	}

	Person(long id) {
		this.id = id;
	}
}

class Ex9_2 {
	public static void main(String[] args) {
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);

		if(p1.equals(p2))
			System.out.println("p1�� p2�� ���� ����Դϴ�.");
		else
			System.out.println("p1�� p2�� �ٸ� ����Դϴ�.");
	}
}