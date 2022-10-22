//					0	1		2		3	이런식으로 값 부여
enum Direction { EAST, SOUTH, WEST, NORTH }

class Ex12_5 {
	public static void main(String[] args) {
		Direction d1 = Direction.EAST;	// 열거형타입. 상수이름 저장
		Direction d2 = Direction.valueOf("WEST");	// 문자열 형태로 저장
		Direction d3 = Enum.valueOf(Direction.class, "EAST");	// 모든 열거형 조상인 Enum을 이용하여 valueOf사용

		System.out.println("d1="+d1);
		System.out.println("d2="+d2);
		System.out.println("d3="+d3);

		System.out.println("d1==d2 ? "+ (d1==d2));
		System.out.println("d1==d3 ? "+ (d1==d3));
		System.out.println("d1.equals(d3) ? "+ d1.equals(d3));	// 객체들이라 equals로 비교 가능
		System.out.println("d1.compareTo(d3) ? "+ (d1.compareTo(d3)));
		System.out.println("d1.compareTo(d2) ? "+ (d1.compareTo(d2)));
		//System.out.println("d2 > d3 ?" + (d1 > d3)); error	

		switch(d1) { 
			case EAST: // Direction.Eest x
				System.out.println("The direction is EAST."); break;
			case SOUTH:
				System.out.println("The direction is SOUTH."); break;
			case WEST:
				System.out.println("The direction is WEST."); break;
			case NORTH:
				System.out.println("The direction is NORTH."); break;
			default:
				System.out.println("Invalid direction."); break;
		}

		Direction[] dArr = Direction.values();	//열거형의 모든 상수를 배열로 반환

		for(Direction d : dArr)  
			System.out.printf("%s=%d%n", d.name(), d.ordinal()); //ordinal:단순히 상수들이 정해진순서. 값과는 무관
	}
}