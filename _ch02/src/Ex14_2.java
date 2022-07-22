import java.util.function.*;
import java.util.*;

class Ex14_2 {
	public static void main(String[] args) {
		Supplier<Integer>  s = ()-> (int)(Math.random()*100)+1; //1~100난수를 반환
		Consumer<Integer>  c = i -> System.out.print(i+", "); //콘솔에 단순출력. 반환아님
		Predicate<Integer> p = i -> i%2==0; //짝수인지 검사
		Function<Integer, Integer> f = i -> i/10*10; // i의 1의자리를 없앰
		
		List<Integer> list = new ArrayList<>();	
		makeRandomList(s, list); //list를 랜덤값으로 채운다
		System.out.println(list);
		printEvenNum(p, c, list); //짝수 출력
		List<Integer> newList = doSomething(f, list);
		System.out.println(newList);
	}

	static <T> List<T> doSomething(Function<T, T> f, List<T> list) {
		List<T> newList = new ArrayList<T>(list.size());

		for(T i : list) {
			newList.add(f.apply(i));	//1의자리를 없애서 새로운list에 저장
		}	

		return newList;
	}

	static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
		System.out.print("[");
		for(T i : list) {
			if(p.test(i))	//짝수인지 검사
				c.accept(i);	//i -> System.out.print(i+", ");화면에i출력
		}	
		System.out.println("]");
	}

	static <T> void makeRandomList(Supplier<T> s, List<T> list) {
		for(int i=0;i<10;i++) {
			list.add(s.get());	//Supplier으로부터 1~100난수값을받아 list에추가
		}
	}
}