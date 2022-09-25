import java.util.*;

class Ex11_16 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		System.out.println(map);
		map.put("asdf", "1234");	//변경했다고 에러x 
		System.out.println(map);

		Scanner s = new Scanner(System.in);	// 화면으로부터 라인단위로 입력받는다.

		while(true) {
			System.out.println("id와 password를 입력해주세요.");
			System.out.print("id :");
			String id = s.nextLine().trim(); //trim:공백제거(사용자가 공백을 입력해도 정상적으로 인식)	

			System.out.print("password :");
			String password = s.nextLine().trim();
			System.out.println();

			if(!map.containsKey(id)) { //key중에 입력한 아이디가 있는지 확인
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
				continue;	//!이므로 다음 while로 넘어감
			} 
			
			if(!(map.get(id)).equals(password)) {	//asdf입력시 get이 1234를반환 -> map.get(id)가 1234값으로 변환되어 equals 확인 -> !에걸리면 while, 참이면 break 	
				System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
			} else {
				System.out.println("id와 비밀번호가 일치합니다.");
				break;
			}
		} // while
	} // main의 끝
}
