import java.util.*;

class Ex11_12 {
	public static void main(String args[]) {
		HashSet setA   = new HashSet();
		HashSet setB   = new HashSet();
		HashSet setHab = new HashSet();
		HashSet setKyo = new HashSet();
		HashSet setCha = new HashSet();

		setA.add("1");	 setA.add("2");  setA.add("3");
		setA.add("4");  setA.add("5");
		System.out.println("A = "+setA);

		setB.add("4");	 setB.add("5");  setB.add("6");		
      setB.add("7");  setB.add("8");
		System.out.println("B = "+setB);
		
//		setA.retainAll(setB); 	 //교집합) A에서 B에만 있는 수 남기기. 공통된 요소만 남기고 삭제됨 
//		setA.addAll(setB);		 //합집합) B의 모든 요소를 추가(중복제외)	
		setA.removeAll(setB);	 //차집합) B와의 공통요소를 제거
		System.out.println(setA);
		
		System.out.println("A �� B = " + setKyo);  
		System.out.println("A U B = " + setHab);  
		System.out.println("A - B = " + setCha); 
	}
}