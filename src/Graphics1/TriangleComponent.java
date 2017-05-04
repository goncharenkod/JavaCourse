package Graphics1;

import java.awt.Graphics;
import javax.swing.JComponent;

public class TriangleComponent extends JComponent {

	private static final long serialVersionUID = 4902057285471885308L;
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawLine(5, getHeight()-10, getWidth()/2-5, 5);
		g.drawLine(getWidth()/2-5, 5, getWidth() - 10, getHeight()-10);
		g.drawLine(getWidth() - 10, getHeight()-10, 5, getHeight()-10);
	}
}
