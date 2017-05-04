package Graphics1;

import javax.swing.JComponent;
import java.awt.Graphics;

public class RectangleComponent extends JComponent {

	private static final long serialVersionUID = 4902057285471885308L;
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRect(5, 5, getWidth()-10, getHeight()-10);
	}
	
}
