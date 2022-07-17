
class Time {
	private int hour; //0~23
	private int minute;
	private int second;
	
	//private사용으로 같은 패키지안에서밖에 사용못하므로 메서드를추가해줘야됨.
	public void setHour(int hour) {
		if(isValidHour(hour)) return;
		
		this.hour = hour;
	}
	//매개변수로 넘겨진 hour가 유효한지 확인해서 알려주는 메서드 
	private boolean isValidHour(int hour) {
		return hour < 0 || hour > 23;
	}
	
	public int getHour() { return hour; }; 
}

public class TimeTest {
	public static void main(String[] args) {
		Time t = new Time();
//		t.hour = 25;
		t.setHour(21); //hour의값을 21로 변경.
		System.out.println(t.getHour());
		t.setHour(100); //100은 유효한값이 아니므로 빠져나감.
		System.out.println(t.getHour());
	}

}
