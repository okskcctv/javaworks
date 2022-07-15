package inputstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadSample2 {

	public static void main(String[] args) {
		
		try {
		// 데이터가 test2.db인 바이트 기반 파일 입력 스트림 생성
			InputStream is = new FileInputStream("C:/file/test2.db");
			
			byte[] buffer = new byte[100];
			
			int data;
			
			while((data = is.read(buffer)) != -1) {	// 배열 길이 만큼 읽어 파일 끝에 도달하면
				for(int i=0; i < data; i++) { // 읽은 바이트 수 만큼 반복
					System.out.println(buffer[i]);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
