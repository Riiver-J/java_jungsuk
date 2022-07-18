abstract class Player { //abstract class
	abstract void play(int pos); //abstract method
	abstract void stop(); //abstract method
}

//추상클래스는 상속을 통해 완성해야 객체 생성가능
class AudioPlayer extends Player {
	void play(int pos) { System.out.println(pos+"위치부터 play합니다."); }
	void stop() {System.out.println("재생을 멈춥니다.");}
}

public class PlayerTest {

	public static void main(String[] args) {
//		Player p = new Player(); //abstract class의 객체를생성
//		AudioPlayer ap = new AudioPlayer();
		Player ap = new AudioPlayer(); //윗문장과 결과는 똑같음.다형성.
		ap.play(100);
		ap.stop();
	}

}
