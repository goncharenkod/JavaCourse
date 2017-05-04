package Stack;

public class StackTest {

	public static void main(String[] args) {
		
		ObjectStack stack1 = new ObjectStack(5);
		
		// ������� �������� �������
		for (int i=1; i<=10; i++) {
			// � ������ ������ ����� ���������� � ������� ������
			stack1.push("������ "+i );
		}
		
		// ������ ��������� ��� ������. ������ ��������� � ��� �� �������, � ������ ��������
		while (stack1.size() > 0) {
			// ������ ������� ���������� ����, �.�. ����� ��� ��� ����� ������
			String s = (String)stack1.pull();
			System.out.println(s);
			System.out.println("Queue size is "+stack1.size());
		}
	}
}
