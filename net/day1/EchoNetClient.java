/* [TCP 통신방식을 이용한 예제]
 *  - 서버단 : 
 *  - 클라이언트단  : Socket이 필요함
 * 
 * 
 * 구현할 내용
 * >> Client가 Server에 접속하면 
 * 1. 클라이언트는 서버로 부터 "안녕하세요?+IP주소+님..."이라는 인사말을 받는다.
 * 2. 그러면 클라이언트는 키보드 입력을 통해 서버쪽에 다음과 같은 메세지를 보낸다.
 *  a) "안녕하세요?" 또는 "Hi"라는 메세지를 클라이언트가 서버쪽으로 보내면 
 *  	서버는 클라이언트에게 "IP주소+님 반갑습니다."라는 메세지를 보낸다.
 *  b) "오늘 날짜는?"라는 메세지를 클라이언트가 서버에게보내면 서버는 클라이언트에게 오늘의 날짜를 보내준다.
 *  c) 기타 다른 메세지를 보내면 서버는 "IP주소+님 반갑습니다.^^ 어여 나가세요~~"라는 메세지를 클라이언트 쪽으로 보낸다.
 * */
package net.day1;

import java.net.*;
import java.util.*;
import java.io.*;

public class EchoNetClient {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.print(">> 연결할 서버의 IP 주소 입력 => ");
			String serverIP =scan.next();
			
			// 1. 통신하기 위한 Socket 객체 생성하기
			final int port = 6000;
			Socket sock = new Socket(serverIP,port);
			
			OutputStream out = sock.getOutputStream();
			InputStream in = sock.getInputStream();
			
			OutputStreamWriter outwrite = new OutputStreamWriter(out); // 1바이트 기반의 OutputStream 객체를 2byte기반으로 인코딩 
			InputStreamReader inread = new InputStreamReader(in); // 1바이트 기반의 InputStream 객체를 2byte기반으로 인코딩 
			
			PrintWriter pWriter = new PrintWriter(outwrite,true); // 두번째 파라미터가 true이므로 Enter를 만나면 자동으로 autoflush가 발생함
			BufferedReader bufReader = new BufferedReader(inread); 
			
			String serverMsg = bufReader.readLine(); // 서버쪽에서 보내온 메세지를 한줄씩 읽어온다.
			System.out.println("From Server "+serverIP+">>"+serverMsg);
			
			InputStreamReader keyinread = new InputStreamReader(System.in); // 1바이트 기반의 InputStream 객체를 2byte기반으로 인코딩 
			BufferedReader keybufReader = new BufferedReader(keyinread,512); 

			// === 클라이언트가 서버쪽으로 키보드로 입력한 내용을 보내도롣 한다.
			// 키보드로 입력받는 스트림을 생성해야 한다.
			String clientSendMsg = ""; // null이 아니어야한다.
			while((clientSendMsg = keybufReader.readLine())!=null) {// 키보드로 ctrl+c가 null이므로 이때 while문을 탈출한다.
				pWriter.println(clientSendMsg); // 서버쪽으로 클라이언트의 메세지를 보내기
				
				serverMsg = bufReader.readLine(); //서버쪽으로부터 메세지를 읽어와서 화면에 출력해주기
				System.out.println(serverMsg);
			}
			if(keyinread!=null) keyinread.close();
			if(keybufReader!=null) keybufReader.close();
			if(bufReader !=null) bufReader.close();
			if(pWriter !=null) pWriter.close();
			if(inread !=null) inread.close();
			if(outwrite !=null) outwrite.close();
			if(in !=null) in.close();
			if(out!= null) out.close();
			
			scan.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(">>  EchoNetClient 종료!!");
	}
}
