class Ex3_11 {
	public static void main(String args[]) { 
		double pi = 3.141592; //3.141을 얻으려면?
		
		System.out.println(pi*1000); //그리고형변환해서 값손실을내자
		System.out.println((int)(pi*1000)); //()watch out
		//실수가 정수로 바뀌면서 소수점 아래는 저장할 수 없으니 날라감
		System.out.println((int)(pi*1000)/1000.0);
		//1000으로 나누면 안돼 3.141로나와야되니까
		
//		double shortPi = Math.round(pi * 1000) / 1000.0;
//		System.out.println(shortPi);
	}
}