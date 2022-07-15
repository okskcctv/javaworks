package outputstream;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {
		System.out.println("여러 개의 문자를 입력하고 [Enter]를 누르세요");
		
		int readByte;
		try {
			while((readByte = System.in.read()) != -1) {
				// 읽을 문자가 없을 때 -1을 반환함
				System.out.print((char)readByte);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
