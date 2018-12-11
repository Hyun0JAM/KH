package io.day4;

import java.io.*;

public class SerializableTest{
	public void objextToFileSave(Object obj, String fileName) { //직렬화
		//객체 obj를 파일로 저장시킨다.
		try {
			FileOutputStream fos = new FileOutputStream(fileName,false); //노드 스트림
			BufferedOutputStream bufout = new BufferedOutputStream(fos,1024); //기본사이즈 = 512 / 필터스트림
			ObjectOutputStream objout = new ObjectOutputStream(bufout); //객체를 파일 fileName에 기록(저장)하는 스트림생성하기
			objout.writeObject(obj); //objout을 사용하여 filname에 기록하기
			objout.close();
			bufout.close();
			fos.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public Object getObjectFormFile(String fileName) { //역직렬화
		//fileName을 읽어서 객체 obj로 변환하기
		Object obj = new Object();
		try {
			FileInputStream fis = new FileInputStream(fileName);
			BufferedInputStream bufin = new BufferedInputStream(fis,1024);
			ObjectInputStream objin = new ObjectInputStream(bufin);
			obj = objin.readObject();
			objin.close();
			bufin.close();
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			System.out.println("입출력 오류");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾을 수 없습니다.");
		}
		return obj;
	}
}
