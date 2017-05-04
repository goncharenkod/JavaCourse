package Graphics1;

import Graphics1.OvalComponent;
import Graphics1.RectangleComponent;
import Graphics1.TriangleComponent;
import java.awt.GridLayout;
import javax.swing.JFrame;

public class ShapeFrame extends JFrame {

	public ShapeFrame() {
		// ������������� LayoutManager � ���� ������� 
	    // ��������� 2 ������ �� 3 �������
		setLayout(new GridLayout(2, 3));
		
		// ������� � "����������" �� ����� ���������� ������ �������
		add(new OvalComponent());
		add(new RectangleComponent());
		add(new TriangleComponent());
		add(new OvalComponent());
		add(new RectangleComponent());
		add(new TriangleComponent());
		
		setBounds(200, 200, 450, 350);
	}
	
}
