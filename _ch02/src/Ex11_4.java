import java.util.*;

class Ex11_4 {
	static Queue q = new LinkedList(); //q의 구현체가 LinkedList
	static final int MAX_SIZE = 5;	// Queue에 최대 5개까지만 저장되도록.

	public static void main(String[] args) {
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");

		while(true) {
			System.out.print(">>");
			try {
				// 화면으로부터 라인단위로 입력받음.
				Scanner s = new Scanner(System.in);  
				String input = s.nextLine().trim();	// 입력한명령어(input)에 따라서 처리하도록. trim:앞뒤공백삭제

				if("".equals(input)) continue;	// 이면,while(true)로 감.

				if(input.equalsIgnoreCase("q")) {	//equalsIgnoreCase:대소문자구분x 비교. 
					System.exit(0); //q입력시 프로그램 종료.
				} else if(input.equalsIgnoreCase("help")) {
					System.out.println(" help - 도움말을 보여줍니다.");
					System.out.println(" q 또는 Q - 프로그램을 종료합니다.");
					System.out.println(" history - 최근에 입력한 명령어를 "
                                                  + MAX_SIZE +"개 보여줍니다.");
				} else if(input.equalsIgnoreCase("history")) {
					int i=0;
					// �Է¹��� ��ɾ �����ϰ�,
					save(input);    

					// LinkedList�� ������ �����ش�.
					LinkedList tmp = (LinkedList)q;
					ListIterator it = tmp.listIterator();

					while(it.hasNext())
						System.out.println(++i+"."+it.next());
				} else {
					save(input);    
					System.out.println(input);
				} // if(input.equalsIgnoreCase("q")) {
			} catch(Exception e) {
				System.out.println("입력오류입니다.");
			}
		} // while(true)
	} //  main()
	public static void save(String input) {
		// save method : queue에 저장한다
		if(!"".equals(input))	//빈 문자열일 경우 저장안함.
          q.offer(input); //큐에 명령어를 저장.

		// queue�� �ִ�ũ�⸦ ������ ���� ó�� �Էµ� ���� �����Ѵ�.
		if(q.size() > MAX_SIZE)  // size()�� Collection�������̽��� ����
			q.remove();
	}
} // end of class