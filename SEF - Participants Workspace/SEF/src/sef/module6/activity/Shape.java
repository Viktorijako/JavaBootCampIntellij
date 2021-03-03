package activity;

public abstract class Shape {


	public String color;




		public abstract double area();

		public abstract double perimeter();
	}
	
	// Complete the code and Add abstract method calculateArea() and calculatePerimeter() with return type as double



	
	public void setColor(String c) {
		color = c;
	}
	public String getColor() {
		return color;
	}
	abstract double calculateArea();
	abstract double calculatePerimeter();



}
