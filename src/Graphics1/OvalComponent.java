package Graphics1;

import javax.swing.JComponent;
import java.awt.*;

//����������� �� ������������ ������, �������
//������������ ��� �������� ����������� �� �����
public class OvalComponent extends JComponent {

	private static final long serialVersionUID = 4902057285471885308L;
	
	// �������������� ����� ����������, � ������� ����������
    // ������ ������ Graphics
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		// ���������� Graphics ��� ��������� ����� � ���������\
		g.drawOval(5, 5, getWidth()-10, getHeight()-10);
	}
	
}

