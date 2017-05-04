package Robots;

public class localMath {

	public double roundTo(double num, int scale) {
		int pow = 10;
		
		if (scale<1) {
			return Math.round(num);
		}
		
		for (int i = 1; i<scale; i++) 
			pow *= 10;
		
		double tmp = num * pow;
		
		return (double) (int) ( (tmp - (int) tmp) >= 0.5f ? tmp+1 : tmp ) / pow;
	}
	
	public float roundTo(float num, int scale) {
		int pow = 10;
		
		if (scale<1) {
			return Math.round(num);
		}
		
		for (int i = 1; i<scale; i++) 
			pow *= 10;
		
		float tmp = num * pow;
		
		return (float) (int) ( (tmp - (int) tmp) >= 0.5f ? tmp+1 : tmp ) / pow;
	}
}
