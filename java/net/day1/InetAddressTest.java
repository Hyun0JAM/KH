package net.day1;

import java.net.*;


public class InetAddressTest {


	public static void main(String[] args) {
		
		// InetAddress 클래스 ==> IP와 관련된 클래스
		
		try {
			//InetAddress inet_ip = InetAddress.getByName("DESKTOP-HGLUII6");
			//InetAddress inet_ip = InetAddress.getByName("127.0.0.1"); 
			// ip가 127.0.0.1 은 자기자신을 가리키는 IP주소이다. 
			// 127.0.0.1 을 LoopBack Address라고 부른다.
			// InetAddress inet_ip = InetAddress.getByName("192.168.50.34"); 
			InetAddress inet_ip = InetAddress.getByName("www.leeym.com");  //localhost <- 자기자신임.
			
			String ip = inet_ip.getHostAddress();
			System.out.println("io =>"+ip); // 내 ip 나옴. myio =>192.168.50.34
			String hostname  = inet_ip.getHostName();
			System.out.println("hostname =>"+hostname);
			
			//"www.leeym.com" 은 "C:\Windows\System32\drivers\etc" 이다.
			
		
			System.out.println("====================================");
			InetAddress inet_ip2 = InetAddress.getByName("www.naver.com");
			
			String ip2 = inet_ip2.getHostAddress();
			System.out.println("io =>\t"+ip2); // 내 ip 나옴. myio =>192.168.50.34
			String hostname2  = inet_ip2.getHostName();
			System.out.println("hostname2 =>\t"+hostname2);
			
			System.out.println("====================================");
			
			InetAddress[] inetAddrArr = InetAddress.getAllByName("www.google.com");
			// 1개의 HostName( 지금은 www.naver.com)에 여러개의 IP Address 를 사용하는 서버의 경우 (예:포탈사이트->네이버,구글 등)
			System.out.println("www.google.com 의 IP 주소들");
			for(int i=0; i<inetAddrArr.length; i++) {
				System.out.println(inetAddrArr[i].getHostAddress());
				
			}
			
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 내pc-> 속성	
		

	}// main

}
