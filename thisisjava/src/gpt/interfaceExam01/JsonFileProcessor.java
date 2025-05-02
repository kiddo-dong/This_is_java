package gpt.interfaceExam01;

public class JsonFileProcessor implements FileProcessor{
	@Override
	public void read(String filePath) {
		System.out.println("[JSON 읽기]"+ filePath + ".json 파일에서 데이터를 읽습니다...");
	}

	@Override
	public void write(String filePath, String content) {
		System.out.println("[JSON 쓰기]"+ filePath + ".json 파일에 다음 내옹을 씁니다 : " + content);
	}
}
