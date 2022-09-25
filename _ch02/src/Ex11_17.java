import java.util.*;

class Ex11_17 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("김자바", 90);
		map.put("김자바", 100);
		map.put("이자바", 100);
		map.put("강자바", 80);
		map.put("안자바", 90);

		Set set = map.entrySet();
		Iterator it = set.iterator();

		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();	//map인터페이스 안에 정의되어있는 Entry인터페이스
			System.out.println("이름 : "+ e.getKey() + ", 점수 : " + e.getValue());
		}

		set = map.keySet();
		System.out.println("참가자 명단 : " + set);

		Collection values = map.values();
		it = values.iterator();

		int total = 0;
		
		while(it.hasNext()) {
			int i = (int)it.next();
			total += i;
		}

		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (float)total/set.size());
		System.out.println("최고점수 : " + Collections.max(values));	//comparable를 구현한 class객체만 min,max 사용 가능
		System.out.println("최저점수 : " + Collections.min(values));
	}
}
