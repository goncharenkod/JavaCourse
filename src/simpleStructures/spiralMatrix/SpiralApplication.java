package simpleStructures.spiralMatrix;

public class SpiralApplication {

	protected static final int SIZE_X = 8;
	protected static final int SIZE_Y = 11;
	
	public static int[][] matrix;
	private static Configuration config;
	
	public static void main(String[] args) {
		
		matrix = new int[SIZE_X][SIZE_Y];
		
		int ost = Math.min(SIZE_X, SIZE_Y) % 2;
				
		int iterations = (int)Math.min(SIZE_X, SIZE_Y) / 2 + (ost==0 ? 0 : 1); // ���������� ��������. �.�. ������� ������ ������� ����� �������
		
		config = new Configuration();
		
		config.setMax(SIZE_X-1, SIZE_Y-1);
		
		int hops = 4; 	// ���-�� ����� � ������ �������. ������ 4, � ��� ������� � ������� 2 ������ - 3 �����. �� ������������ ����� ��� ������� 4 
		
		int counter = 0; // ������� ��� ����������
		
		// �������� ���������
		for (int k = 0; k < iterations; k++) {
			
			// ����� ������ ������� ����� ������� ������ � ���� (��� ������ - ��� ������)
			config.setStart(k, k);
			
			config.setDirection(0, 1); // ������ ��� ����� ������ ��������� �� ������� �������. ���� ������ ������� (1, 0)
			
			int startI = config.getStartX();
			int startJ = config.getStartY();
			
			int maxI = config.getMaxX();
			int maxJ = config.getMaxY();
			
			// ���� ������� �� ���������� � �������������, ����� �������� ��� ���������� ���������� ������
			if (startI == maxI || startJ == maxJ)
				hops = 1;
			
			// ��� ������ ����� ����� ������� ���������� ��������� � ����������
			int curI = startI;
			int curJ = startJ;
			
			// ������ �����
			int h=1;
			counter++;
			
			do {
				// ������������� 
				matrix[curI][curJ] = counter++;
				
				// ��������
				curI = curI + config.getDirectionX();
				curJ = curJ + config.getDirectionY();
				
				//���������
				// ���� ���������� ������� �� ������� �������� �������������� - ����������� �����
				if (curI < startI || curI > maxI || curJ < startJ || curJ > maxJ || (curI==startI && curJ==startJ)) {
					h++;
					counter--; // ������� ���� ��������� ������, ��� �� ������������ �� ���������� ������� ��� ����������� ����� � � ��� ������ �������� � ������ �����������
					// ����� �� �������, ������� ���������� �������
					curI = curI - config.getDirectionX();
					curJ = curJ - config.getDirectionY();
					//continue;
					
					// ���������� ����� ����������� �������� �����
					switch (h) {
					case 1:
						config.setDirection(0, 1); // ��������� ����� �������
						break;
					case 2:
						config.setDirection(1, 0); // ��������� ������ ����
						break;
					case 3:
						config.setDirection(0, -1); // ��������� ������ ������
						break;
					case 4:
						config.setDirection(-1, 0); // ��������� ����� �����
						break;
					default:
						break;
					}
				}
				
			} while (h<=hops); // ����� �����
			
			// � ���������� �� � ����� �����������
			curI = curI + config.getDirectionX();
			curJ = curJ + config.getDirectionY();
			
			config.setMax(--maxI, --maxJ);
			
		} // ����� ��������
		
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
