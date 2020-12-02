package sample5;

import java.io.FileWriter;
import java.io.IOException;

public class FileOutput implements Outputter{
	
	private String filePath; // 출력파일에 대한 경로와 파일이름을 저장할 필드

	public void setFilePath(String filePath) {
		this.filePath = filePath; 
		System.out.println("2. 파일 경로와 파일이름 설정");
	}

	@Override
	public void output(String message) throws IOException {
		FileWriter out=new FileWriter(filePath);
		out.write(message);
		out.close();
		System.out.println("5. 파일전송 성공");
	}
}







