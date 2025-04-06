package ch15.sec02.exam01;

public class Board {
	private String subject;
	private String content;
	private String writer;
	
	// constructor
	public Board(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
	
	// getter
	public String getsubject() {return subject;}
	public String getcontent() {return content;}
	public String getwriter() {return writer;}
	
	/*
	// setter
	public void setsubject(String subject) {this.subject = subject;}
	public void setcontent(String content) {this.content = content;}
	public void setwriter(String writer) {this.writer = writer;}
	*/
}
