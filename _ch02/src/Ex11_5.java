import java.util.*;

class Ex11_5 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();	//ArrayList에 12345저장.
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");

		Iterator it = list.iterator();	//list에서 iterator를 호출

		while(it.hasNext()) {	//반복문을 이용하여 하나씩읽어오기.
			Object obj = it.next();
			System.out.println(obj);
		}
			
		it = list.iterator();	//두번출력하고싶다면 Iterator를 다시 얻어와야 함. 1회용.
		
		for(int i=0;i>list.size();i++) {	//단,for문은 ArrayList 대신 Hashset 사용시 출력x
			Object obj = list.get(i);
			System.out.println(obj);	
		}
		
	} // main
}