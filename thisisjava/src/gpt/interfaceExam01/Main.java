package gpt.interfaceExam01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner us_in = new Scanner(System.in);
		
		FileProcessor txt = new TextFileProcessor();
		FileProcessor json = new JsonFileProcessor();
		FileProcessor env = new EncryptedFileProcessor();
		
		System.out.print("파일 형식을 입력하세요 (txt/json/env) : ");
		String filePath = us_in.next();
		
		switch(filePath) {
		case "txt" :
			txt.read(filePath);
			txt.write(filePath, "textfile");
			break;
		case "json" :
			json.read(filePath);
			json.write(filePath, "{User : 최동현}");
			break;
		case "env":
			env.read(filePath);
			env.write(filePath, "textfileEnv");
			break;
		default : System.out.println("잘못된 입력");
			break;
		}
	}
}