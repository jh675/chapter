package com.yedam.java.ch1502;

public class Product<K, M> {
	private K kind;
	private M model;
	
	public void setKind(K kind) {
		this.kind = kind;
	}
	
	public void setModel(M model) {
		this.model = model;
	}
	
	public K getKind() {
		return kind;
	}
	
	public M getModel() {
		return model;
	}
}
