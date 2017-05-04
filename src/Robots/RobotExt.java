package Robots;

public class RobotExt extends Robot{

	public RobotExt(double x, double y, double course) {
		super(x,y, course);
		System.out.println(getClass().getName());
	}

	public void moveBack(int distance) {
		moveForward(-distance);
	}
	
	public void printCoordinates() {
		System.out.println("Ext x="+getX() + ", Ext y=" + getY());
	}
	
	
}
