class Ex4_16 {
	public static void main(String[] args) { 
		int sum = 0;
		int i   = 0;

		while(true) { //무한반복문. true빼면안됨. for(;;) or for(;true;) {}로 표시
			if(sum > 100)
				break; //조건 충족시 자신이 속한 하나의 반복문을 벗어남
			++i;
			sum += i;
		} // end of while

		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
	}   
}