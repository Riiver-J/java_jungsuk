import java.util.*;

class Ex11_9 {
	public static void main(String[] args) {
		Object[] objArr = {"1",new Integer(1),"2","2","3","3","4","4","4"};
		Set set = new HashSet();

		for(int i=0; i < objArr.length; i++) {
			System.out.println(objArr[i]+"="+set.add(objArr[i]));	// HashSet에 objArr의 요소들을 저장한다. //set:순서유지x 중복x 라서 중복된 값이면 false
		}
                // HashSet에 저장된 요소들을 출력. 1이 두개출력되는데, 하나는 문자열 나머지는 Integer.
		System.out.println(set);	

		// HashSet에 저장된 요소들을 출력한다.(Iterator이용)
		Iterator it = set.iterator();	//iterator메서드 사용으로 호출 후 -> hashNext로 읽어올 요소가 남아있는지 확인 -> 
		
		while(it.hasNext()) {
			System.out.println(it.next());	//요소 하나 꺼내오기 -> 꺼내올 값이 없을때까지 while 문으로 반복 
		}
	}
}
