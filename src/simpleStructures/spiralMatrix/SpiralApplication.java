package simpleStructures.spiralMatrix;

public class SpiralApplication {

	protected static final int SIZE_X = 8;
	protected static final int SIZE_Y = 11;
	
	public static int[][] matrix;
	private static Configuration config;
	
	public static void main(String[] args) {
		
		matrix = new int[SIZE_X][SIZE_Y];
		
		int ost = Math.min(SIZE_X, SIZE_Y) % 2;
				
		int iterations = (int)Math.min(SIZE_X, SIZE_Y) / 2 + (ost==0 ? 0 : 1); // количество итераций. Т.е. сколько витков спирали нужно сделать
		
		config = new Configuration();
		
		config.setMax(SIZE_X-1, SIZE_Y-1);
		
		int hops = 4; 	// кол-во веток в каждой спирали. Обычно 4, а для массива в котором 2 строки - 3 ветки. Но теоретически можно все принять 4 
		
		int counter = 0; // счетчик для заполнения
		
		// начинаем заполнять
		for (int k = 0; k < iterations; k++) {
			
			// точка старта каждого витка спирали всегда в углу (чем дальше - тем глубже)
			config.setStart(k, k);
			
			config.setDirection(0, 1); // первый хоп витка всегда заполняем по часовой стрелке. Если против часовой (1, 0)
			
			int startI = config.getStartX();
			int startJ = config.getStartY();
			
			int maxI = config.getMaxX();
			int maxJ = config.getMaxY();
			
			// если матрица не квадратная а прямоугольная, может остаться для заполнения одномерный массив
			if (startI == maxI || startJ == maxJ)
				hops = 1;
			
			// для первой ветки витка текущие координаты совпадают с начальными
			int curI = startI;
			int curJ = startJ;
			
			// делаем витки
			int h=1;
			counter++;
			
			do {
				// устанавливаем 
				matrix[curI][curJ] = counter++;
				
				// сдвигаем
				curI = curI + config.getDirectionX();
				curJ = curJ + config.getDirectionY();
				
				//проверяем
				// если координаты выходят за границы текущего прямоугольника - заканчиваем виток
				if (curI < startI || curI > maxI || curJ < startJ || curJ > maxJ || (curI==startI && curJ==startJ)) {
					h++;
					counter--; // счетчик надо уменьшать потому, что мы возвращаемся на предыдущую угловую уже заполненную точку и с нее начнем движение в другом направлении
					// вышли за границы, сдвинем координаты обратно
					curI = curI - config.getDirectionX();
					curJ = curJ - config.getDirectionY();
					//continue;
					
					// определяем новое направление движения ветки
					switch (h) {
					case 1:
						config.setDirection(0, 1); // двигаемся слева направо
						break;
					case 2:
						config.setDirection(1, 0); // двигаемся сверху вниз
						break;
					case 3:
						config.setDirection(0, -1); // двигаемся справа налево
						break;
					case 4:
						config.setDirection(-1, 0); // двигаемся снизу вверх
						break;
					default:
						break;
					}
				}
				
			} while (h<=hops); // конец хопов
			
			// и передвинем их в новом направлении
			curI = curI + config.getDirectionX();
			curJ = curJ + config.getDirectionY();
			
			config.setMax(--maxI, --maxJ);
			
		} // конец итераций
		
		printArray();
	}
	
	private static void printArray() {
		for (int i = 0; i<SIZE_X; i++) {
			for (int j=0; j<SIZE_Y; j++) {
				System.out.printf("%4d", matrix[i][j]);
			}
			System.out.println();
		}
		
	}
}
