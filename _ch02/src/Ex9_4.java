import java.util.Objects;

class Card2 {
	String kind;
	int number;

	Card2() {
		this("SPADE", 1);
	}

	Card2(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	// equals()를 오버라이딩하면, hashCode()도 오버라이딩 해야됨
	public int hashCode() {
		return Objects.hash(kind, number);
				//objects클래스는 객체와 관련된 유용한 메서드를 제공하는 유틸 클래스
	}
	public boolean equals(Object obj) {	//오버라이딩시, 선언부가 일치해야됨(object써야)
		if(!(obj instanceof Card2))
			return false;
		
		Card2 c = (Card2)obj; //obj를 Card2로 형변환
		return this.kind.equals(c.kind) && this.number==c.number;
			
		
	}
	
	//object클래스의 toString을 오버라이딩
	public String toString() {
		return "kind:"+kind+", number:"+number;
	}
}

class Ex9_4 {
	public static void main(String[] args) {
		Card2 c1 = new Card2();
		Card2 c2 = new Card2();
		
		System.out.println(c1.equals(c2)); //equals도 쓰려면 오버라이딩해야 됨

		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
	}
}