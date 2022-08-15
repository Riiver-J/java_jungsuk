class Ex8_7 {
	public static void main(String[] args) {
		try {
			throw new Exception();		// Exception을 고의로 발생시킨것
			
		} catch(Exception e) {}
		
		throw new RuntimeException();	//RuntimeException과 그 자손은 예외처리 안해줘도 컴파일이 됨(예외가발생하지 않는다는 의미는 아님)		
	}
}

// try {} catch(Exception e){} ->try 안에 넣고 돌리면 아무것도 안뜸 ->예외잡힘
// 컴파일이 잘 된다고 해서 실행했을 때 예외가 발생안한다는 보장x
// Exception과 그 자손은 반드시 예외처리를 해줘야 함