import java.util.*;

class Ex11_15 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();	//set으로 바꿀 수 x : headSet,tailSet,subSet모두 TreeSet에만 존재하는 메서드이므로 
		int[] score = {80, 95, 50, 35, 45, 65, 10, 100};

		for(int i=0; i < score.length; i++)
			set.add(new Integer(score[i]));

		System.out.println("50보다 작은 값 :" + set.headSet(50));
		System.out.println("50보다 큰 값 :"  + set.tailSet(50));
		System.out.println("40과 80사이의 값 :"  + set.subSet(40, 80));
	}
}