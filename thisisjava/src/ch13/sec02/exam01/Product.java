package ch13.sec02.exam01;

public class Product <K,M> {
	private K kind;
	private M model;
	
	public void setkind(K kind) {
		this.kind = kind;
	}
	public void setmodel(M model) {
		this.model = model;
	}
	
	
	public K getkind() {
		return kind;
	}
	public M getmodel() {
		return model;
	}
}
