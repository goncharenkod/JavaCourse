package Graphics1;

import javax.swing.JComponent;
import java.awt.*;

//Наследуемся от стандартного класса, который
//используется для создания компонентов на форме
public class OvalComponent extends JComponent {

	private static final long serialVersionUID = 4902057285471885308L;
	
	// Переопределяем метод рисованиая, в который передается
    // объект класса Graphics
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		// Используем Graphics для рисования овала с отступами\
		g.drawOval(5, 5, getWidth()-10, getHeight()-10);
	}
	
}

