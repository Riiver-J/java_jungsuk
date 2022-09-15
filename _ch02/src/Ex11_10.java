import java.util.*;

class Ex11_10 {
	public static void main(String[] args) {
		Set set = new HashSet();
		
		//set의 크기가 6보다 작은동안 1~45사이의 난수를 저장.
		for (int i = 0; set.size() < 6 ; i++) {
			int num = (int)(Math.random()*45) + 1;
//			set.add(new Integer(num)); 아래처럼num만써도됨.
			set.add(num);
		}

		List list = new LinkedList(set); // 1.set의 모든 요소를 LinkedList를 새로 만들어 저장, LinkedList(Collection c) 
		Collections.sort(list);          // 2.List를 정렬, Collections.sort(List list)
		System.out.println(list);		// 3.List를 출력.
	}
}
