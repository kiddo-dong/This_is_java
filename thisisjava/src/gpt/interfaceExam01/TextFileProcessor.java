package gpt.interfaceExam01;

public class TextFileProcessor implements FileProcessor{
	@Override
	public void read(String filePath) {
		System.out.println("[txt 읽기]"+ filePath + ".txt 파일에서 데이터를 읽습니다...");
	}

	@Override
	public void write(String filePath, String content) {
		System.out.println("[txt 쓰기]"+ filePath + ".txt 파일에 다음 내옹을 씁니다 : " + content);
	}
	
}
