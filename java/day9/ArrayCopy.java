/* >>>>> 배열의 복사 <<<<<<

		   배열은 한번 생성하면 그 크기를 변경할 수 없기 때문에 
		   더 많은 저장공간이 필요하다면 현재 사용중인 배열보다 더 큰 배열을 새로 만들고
		   이전 배열로부터 내용을 복사해야한다. 
		   배열 간의 내용을 복사하려면 for문을 사용하거나 
		   System클래스의 arraycopy()메소드를 사용하면 된다. 
		*/


/*
		System.arraycopy(src, srcPos, dest, destPos, length); 
		
			배열 src의 내용을 새배열 dest 로 복사하는데, 
			복사할 내용은 배열 src의 인덱스 srcPos의 위치부터 시작해서 
			length 만큼을 새배열 dest 의 인덱스 destPos인 위치에 복사한다. 
		    이때 복사되어지는 새배열(dest)의 위치가 적절하지 못하여 
		    복사하려는 내용(src)보다 여유공간이 적으면 
		    ArrayIndexOutOfBoundsException이 발생한다. 
		*/

package my.day9;

public class ArrayCopy {

	public static void main(String[] args) {
		String[] friendArr = {"김상원","이고은","최민주"};
		String[] newfArr= new String[5];
		
		for(int i=0;i<friendArr.length;i++) {
			String str = (i<friendArr.length-1)?"\t":"\n";
			System.out.print(friendArr[i]+str);
		}
		// friendArr[3] ="김혜원"; 배열 크기가 맞지 않기 때문에 에러
		
		for(int i=0;i<friendArr.length;i++) {
			newfArr[i]=friendArr[i];
		}
		newfArr[3] ="김혜원";
		newfArr[4] ="배수미";
		
		for(int i=0;i<newfArr.length;i++) {
			String str = (i<newfArr.length-1)?"\t":"\n";
			System.out.print(newfArr[i]+str);
		}
		System.out.println("======================================");
		/*System.arraycopy(src, srcPos, dest, destPos, length); 
		
		배열 src의 내용을 새배열 dest 로 복사하는데, 
		복사할 내용은 배열 src의 인덱스 srcPos의 위치부터 시작해서 
		length 만큼을 새배열 dest 의 인덱스 destPos인 위치에 복사한다. 
	    이때 복사되어지는 새배열(dest)의 위치가 적절하지 못하여 
	    복사하려는 내용(src)보다 여유공간이 적으면 
	    ArrayIndexOutOfBoundsException이 발생한다. */
		String[] friendArr2 = {"박민규","수학의정석 기본","수학의정석 실력"};
		String[] newfriendArr2 = new String[5];
		
		System.arraycopy(friendArr2, 0, newfriendArr2, 0, friendArr.length);
		for(int i=0;i<newfriendArr2.length;i++) {
			String str = (i<newfriendArr2.length-1)?"\t":"\n";
			System.out.print(newfriendArr2[i]+str);
		}	
	}
}
