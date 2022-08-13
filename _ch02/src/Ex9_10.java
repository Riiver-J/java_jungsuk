class Ex9_10 {
	public static void main(String[] args) {
		int iVal = 100;
//		String strVal = String.valueOf(iVal); // int를 String으로 변환
		String strVal = iVal+"";	//int를 String으로 변환
		
		double dVal = 200.0;
		String strVal2 = dVal + "";	// int�� String���� ��ȯ�ϴ� �� �ٸ� ���

		double sum  = Integer.parseInt("+"+strVal)	//문자열을 숫자로 바꾸는 방법(old)	
                                          + Double.parseDouble(strVal2);
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
		
		System.out.println(String.join("*",strVal,"+",strVal2,"=")+sum);
		System.out.println(strVal+"+"+strVal2+"="+sum2);
	}
}