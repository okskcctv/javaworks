package inputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyExample2 {

	public static void main(String[] args) {
		// try ~ with ~ resource문 : close()를 명시하지 않아도 됨
		long start = 0, end = 0;
		String originFile = "C:/file/lotus.png";	// 원본 파일
		String copyFile = "C:/file/lotus2.png";		// 복사 파일
		
		try {FileInputStream fis = new FileInputStream(originFile);
			FileOutputStream fos = new FileOutputStream(copyFile);
			start = System.currentTimeMillis();	// 수행 전 시간
			int i;
			while((i = fis.read()) != -1) {
				fos.write(i);
			}
			end = System.currentTimeMillis();	// 수행 후 시간
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일 복사 소요시간: " + (end - start) + "ms");
	}

}
