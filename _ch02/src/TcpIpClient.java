import java.net.*;
import java.io.*;

public class TcpIpClient {
	public static void main(String args[]) {
		try {
			String serverIp = "127.0.0.1";

			System.out.println("서버에 연결중입니다. 서버IP :" + serverIp);
			// 소켓 생성 -> 연결 요청.
			Socket socket = new Socket(serverIp, 7777); 

			// 소켓의 입력스트림을 얻는다.
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);

			// 소켓으로부터 받은 data 출력.
			System.out.println("서버로부터 받은 메세지 :"+dis.readUTF());      
			System.out.println("연결을 종료합니다.");

			// close 스트림&소켓.
			dis.close();
			socket.close();
			System.out.println("연결이 종료되었습니다.");
		} catch(ConnectException ce) {
			ce.printStackTrace();
		} catch(IOException ie) {
			ie.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();  
		}  
	} // main
}