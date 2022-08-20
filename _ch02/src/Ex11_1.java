import java.util.*;

class Ex11_1 {
	public static void main(String[] args) {
		//기본길이(용량,capacity)가 10인 ArrayList를 생성
		ArrayList list1 = new ArrayList(10);
		//ArrayList에는 객체만 저장 가능.
		//autoboxing에 의해 기본형이 참조형으로 자동전환됨.
//		list1.add(5); 라고 적어도 아래로 자동변환. 원래는 이렇게 기본형 못넣으니까.
		list1.add(new Integer(5));
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		
		//ArrayList (collection c)
		//subList? ArrayList의 일부를 떼어내서 새로운 list를 만든 것. 읽기 전용임.
		ArrayList list2 = new ArrayList(list1.subList(1,4)); 
		print(list1, list2);

		//Collection은 인터페이스,Collections는 클래스. collection을 정렬할떄는 collections의 메서드인 sort를 사용하면 됨.
		Collections.sort(list1);	// list1�� list2�� �����Ѵ�.
		Collections.sort(list2);	// Collections.sort(List l)
		print(list1, list2);
//
		System.out.println("list1.containsAll(list2):"	//list1이 list2의 모든 요소를 포함하고 있는지 묻는것.
                                               + list1.containsAll(list2));
//
		list2.add("B");
		list2.add("C");
//		list2.add(3, "A");
		print(list1, list2);
//
		list2.set(3, "AA");	//set:변경
		print(list1, list2);
//
//		// list1���� list2�� ��ġ�� �κи� ����� �������� �����Ѵ�.
//		System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));
//
//		print(list1, list2);
//
//		//  list2���� list1�� ���Ե� ��ü���� �����Ѵ�.
//		for(int i= list2.size()-1; i >= 0; i--) {
//			if(list1.contains(list2.get(i)))
//				list2.remove(i);
//		}
//		print(list1, list2);
	} // main의 끝

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println();		
	}
} // class