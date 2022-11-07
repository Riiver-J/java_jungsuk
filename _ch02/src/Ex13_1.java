class Ex13_1 {
	public static void main(String args[]) {
		ThreadEx1_1 t1 = new ThreadEx1_1();

		Runnable r = new ThreadEx1_2();
		Thread t2 = new Thread(r);	  

		t1.start();
		t2.start();
	}
}

class ThreadEx1_1 extends Thread {	// Thread클래스를 상속하여 쓰레드를 구현하는 방식
	public void run() {	// 쓰레드가 수행할 작업을 작성 ==main 
		for(int i=0; i < 5; i++) {
			System.out.println(this.getName()); // 조상인 Thread의 getName()을 호출하므로 this.생략 가능
		}
	}
}

class ThreadEx1_2 implements Runnable {	// Runnable클래스를 구현하여 쓰레드를 구현하는 방식
	public void run() {	// 쓰레드가 수행할 작업을 작성
		for(int i=0; i < 5; i++) {	 
			
			System.out.println(Thread.currentThread().getName()); // Thread.currentTread().:현재실행중인 Thread를 반환. 인터페이스라 참조해야
		}
	}
}