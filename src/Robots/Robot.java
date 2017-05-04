package Robots;

public class Robot {
	
	private double x = 0;
	private double y = 0;
	
	private double course = 0;
	
	public Robot(double x, double y, double course){
		this.x = x; this.y = y; this.course = course;
	}
	
	public Robot() {
		x = 0; y = 0;
		System.out.println(getClass().getName());
	}
	
	private double roundTo(double num, int scale) {
		int pow = 10;
		
		if (scale<1) {
			return Math.round(num);
		}
		
		for (int i = 1; i<scale; i++) 
			pow *= 10;
		
		double tmp = num * pow;
		
		return (double) (int) ( (tmp - (int) tmp) >= 0.5f ? tmp+1 : tmp ) / pow;
	}
		
	// Move to distance
	public void moveForward(int distance) {
		
		//localMath lMath = new localMath();
		//x = lMath.roundTo(x + distance * Math.cos(course / 180 * Math.PI), 2);
		//y = lMath.roundTo(y + distance * Math.sin(course / 180 * Math.PI), 2);
		
		x = roundTo(x + distance * Math.cos(course / 180 * Math.PI), 2);
		y = roundTo(y + distance * Math.sin(course / 180 * Math.PI), 2);

	}
	
	// Print current coordinates
	public void printCoordinates() {
		System.out.println("x="+x + ", y=" + y);
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getCourse() {
		return course;
	}
	
	public void setCourse(double newCourse) {
		course = newCourse;
	}
	
}


