package gpt.interfaceExam01;

public class EncryptedFileProcessor implements FileProcessor{
	@Override
	public void read(String filePath) {
		System.out.println("[enc]"+ filePath + ".enc 파일에서 데이터를 읽습니다...");
	}

	@Override
	public void write(String filePath, String content) {
		StringBuffer str = new StringBuffer(content);
		System.out.println("[enc]"+ filePath + ".enc 파일에 다음 내용을 씁니다 : " + str.reverse());
	}
}