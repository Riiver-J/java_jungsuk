class Ex3_2re {
	public static void main(String args[]) {
		int i=5, j=0;

		j = i; //후위형은 아래로구분
		i++;
		System.out.println("j=i++; 실행후 , i=" + i +", j="+ j);

		i=5;        //결과를 비교하기위해, i와 j값을 다시 5와 0으로 변경함.
		j=0;

		++i;
		j = i; //전위형은 위로구분
		System.out.println("j=++i; 실행후, i=" + i +", j="+ j);
	}
}