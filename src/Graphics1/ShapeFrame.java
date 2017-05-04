package Graphics1;

import Graphics1.OvalComponent;
import Graphics1.RectangleComponent;
import Graphics1.TriangleComponent;
import java.awt.GridLayout;
import javax.swing.JFrame;

public class ShapeFrame extends JFrame {

	public ShapeFrame() {
		// Устанавливаем LayoutManager в виде таблицы 
	    // размерами 2 строки на 3 столбца
		setLayout(new GridLayout(2, 3));
		
		// Создаем и "укладываем" на форму компоненты разных классов
		add(new OvalComponent());
		add(new RectangleComponent());
		add(new TriangleComponent());
		add(new OvalComponent());
		add(new RectangleComponent());
		add(new TriangleComponent());
		
		setBounds(200, 200, 450, 350);
	}
	
}
