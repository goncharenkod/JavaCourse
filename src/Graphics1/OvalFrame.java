package Graphics1;

import javax.swing.JFrame;

public class OvalFrame extends JFrame {
	
	private static final long serialVersionUID = 4902057285471885308L;
	
	public OvalFrame() {
		
		OvalComponent oc = new OvalComponent();
		
		// ���������� ����� ������ JFrame ��� ���������� ���������� �� ������� ������.
		add(oc);
		
		// ������������� ���������� � ������� ����
		setBounds(200, 200, 300, 250);
		
	}
}
