package com.company.liskov_1;

//public class Square extends Rectangle { -- square is not a rectangle in terms of java code terms -- so cant do this
public class Square implements Shape {
	
	private int side;
	
	public Square(int side) {
		this.side = side;
	}
	
	

	public void setSide(int side) {
		this.side = side;
	}



	public int getSide() {
		return side;
	}



	@Override
	public int computeArea() {
		return this.side * this.side;
	}

	
}
