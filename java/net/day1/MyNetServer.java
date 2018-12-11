/*	시험
 	=== TCP 통신방식을 이용한 예제 === // 암기.
 	- 서버단 		: ServerSocket 과  Socket 이 필요함. 
 	- 클라이언트단 	: Socket 이 필요함.
 */
package net.day1;

import java.net.*; // import java.net.*; 은 항상 java.io.*;와 동반해야함/채팅하려면 필요함.
import java.util.Date;
import java.io.*;


public class MyNetServer {

	public static void main(String[] args) throws IOException {
		ServerSocket serverSock= new ServerSocket(10000);
		while(true) {
			System.out.println("--- 클라이언트 연결을 기다림....");	
			Socket sock = serverSock.accept();

			System.out.println(">>> 클라이언트가 접속해옴 <<<");	
			InetAddress clientInetAddress = sock.getInetAddress();
			String clientIP = clientInetAddress.getHostAddress();
			System.out.println("클라이언트의 IP 주소 => "+clientIP);
			
			OutputStream outstrm = sock.getOutputStream();	
			DataOutputStream doutstrm = new DataOutputStream(outstrm);
			
			InputStream instrm = sock.getInputStream();
			DataInputStream dinstrm = new DataInputStream(instrm);
				
			String	clientMsg =  dinstrm.readUTF();
			System.out.println(clientIP+">>"+clientMsg);
			
			String msg="";
			if(clientMsg.startsWith("time")) {
				Date date = new Date();
				String time = String.format("%tF %tT %tA", date);
				msg = time;
			}	
			doutstrm.writeUTF(msg);	
			doutstrm.flush();
			
			if(doutstrm != null) doutstrm.close();
			if(outstrm != null) outstrm.close();
			if(dinstrm != null) dinstrm.close();
			if(instrm != null) instrm.close();
			if(sock != null) sock.close();
				
		}		
	}
}
