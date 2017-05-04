package simpleStructures.spiralMatrix;

public class Configuration {

	// Определяем массив в котором будет храниться  
	protected final static int DIRECTION = 0; 	// Определяет направление движения курсора по размеренностям (сХ - по строкам, сY - по столбцам)
												// Три значения -1: движение справа на лево; 0 - не изменяется; 1 - движение слева на право
	protected final static int START = 1; 		// Начальная координата движения (сХ - по строкам, сY - по столбцам)
	protected final static int MAX = 2; 		// Конечная координата движения (сХ - по строкам, сY - по столбцам)
	
	protected final static int cX = 0;
	protected final static int cY = 1;
	
	protected int[][] config = new int[3][2];
	
	protected void configuration() {
		
		config[DIRECTION][cX] = 0; 	config[DIRECTION][cY] = 1;
		config[START][cX] = 0; 		config[START][cY] = 0;
		config[MAX][cX] = 1; 		config[MAX][cY] = 1;
	}
	
	public void setDirection(int directionX, int directionY) {
		config[DIRECTION][cX] = directionX;
		config[DIRECTION][cY] = directionY;
	}
	
	public void setStart(int startX, int startY) {
		config[START][cX] = startX;
		config[START][cY] = startY;
	}
	
	public void setMax(int maxX, int maxY) {
		config[MAX][cX] = maxX;
		config[MAX][cY] = maxY;
	}
	
	
	public int getDirectionX() {
		return config[DIRECTION][cX];
	}
	
	public int getDirectionY() {
		return config[DIRECTION][cY];
	}
	
	public int getStartX() {
		return config[START][cX];
	}
	
	public int getStartY() {
		return config[START][cY];
	}
	
	public int getMaxX() {
		return config[MAX][cX];
	}
	
	public int getMaxY() {
		return config[MAX][cY];
	}
}

