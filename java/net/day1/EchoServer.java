
package net.day1;

import java.net.*;
import java.util.*;
import java.io.*;

public class EchoServer extends Thread{

	public static void main(String[] args) {
		// 1. 서버 소켓 생성
		final int port = 6000;
		ServerSocket srvSock = null;
		Socket sock = null;
		Thread thr = new Thread();
		try {
			srvSock= new ServerSocket(port);
			System.out.println("--- EchoNetServer Ready...");
			// 2. 통신하기 위한 Socket 객체 생성하기
			sock = srvSock.accept();
			// 3. sock을 사용하여 클라이언트에게 데이터를 보내는(출력) 연결통로인 String 생성하기
			//    sock을 사용하여 클라이언트에게 데이터를 보내는(입력) 연결통로인 String 생성하기
			OutputStream out = sock.getOutputStream();
			InputStream in = sock.getInputStream();
			
			DataOutputStream doutstrm = new DataOutputStream(out);
			DataInputStream dinstrm = new DataInputStream(in);
			
			OutputStreamWriter outwrite = new OutputStreamWriter(doutstrm); // 1바이트 기반의 OutputStream 객체를 2byte기반으로 인코딩 
			InputStreamReader inread = new InputStreamReader(dinstrm); // 1바이트 기반의 InputStream 객체를 2byte기반으로 인코딩 
			
			PrintWriter pWriter = new PrintWriter(outwrite,true); // 두번째 파라미터가 true이므로 Enter를 만나면 자동으로 autoflush가 발생함
			BufferedReader bufread = new BufferedReader(inread);
			
			InetAddress clientInetAddress = sock.getInetAddress();
			String clientIP = clientInetAddress.getHostAddress();
			
			String serverMsg = "안녕하세요? "+clientIP+" 님..";
			pWriter.println(serverMsg);
			
			// === 클라이언트쪽에서 보내온 메세지를 받아서 적절하게 응답해주기
			String	clientMsg = "";
			while((clientMsg=bufread.readLine())!=null) {
				if(clientMsg.startsWith("time")) {
					Date date = new Date();
					String time = String.format("%tT", date);
					pWriter.println("* Time : "+time); // 클라이언트로 보내기
				}
			}
			if(bufread !=null) bufread.close();
			if(pWriter !=null) pWriter.close();
			if(inread !=null) inread.close();
			if(outwrite !=null) outwrite.close();
			if(dinstrm !=null) dinstrm.close();
			if(doutstrm !=null) doutstrm.close();
			if(in !=null) in.close();
			if(out !=null) out.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(">> EchoServer 종료!!");
		
	}

}
