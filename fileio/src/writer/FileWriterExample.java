package writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterExample {

	public static void main(String[] args) {
		// 문자 파일 기반 출력 스트림 생성
		try(Writer fw = new FileWriter("file1.txt")){
			fw.write("Hello Java!\n");
			fw.write("만나서 반갑습니다.\n");
			// 정수가 아닌 아스키 코드, 정수, 실수는 사용할 수 없음
			fw.write(48);	// 문자 0
			fw.write(10);	// 개행 문자(줄바꿈)
			
			char[] buf = {'s', 'm', 'i', 'l', 'e'};	// 배열 출력
			fw.write(buf);
			fw.write(10);
			fw.write(buf, 1, 4);	// 1번 인덱스부터 2개 출력
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("수행 완료!");
	}

}
