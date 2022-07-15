package inputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyexample {

	public static void main(String[] args) {
		// 이미지 파일을 읽어오기
		String originFile = "C:/file/lotus.png";	// 원본 파일
		String copyFile = "C:/file/lotus2.png";		// 복사 파일
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(originFile);
			fos = new FileOutputStream(copyFile);
			int i;
			while((i=fis.read()) != -1) {	// 이미지 읽기
				fos.write(i);				// 이미지 쓰기
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				fos.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
