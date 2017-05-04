package Robots;

public class RobotManager {

	public static void main(String[] args) {
		
		Robot r1 = new RobotExt(10, 10, 45);
		
		r1.printCoordinates();
		
		r1.moveForward(20);
		r1.printCoordinates();
		
		
		r1.setCourse(90);
		r1.moveForward(20);
		r1.printCoordinates();
		
		r1.setCourse(135);
		r1.moveForward(20);
		r1.printCoordinates();
		
		/*
		r1.setCourse(0);
		r1.moveBack(20);
		r1.printCoordinates();
		*/
	}
}
