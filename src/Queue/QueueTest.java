package Queue;

public class QueueTest {

	public static void main(String[] args) {

		ObjectQueue queue = new ObjectQueue();

		System.out.println("������ ������ ������� \n");

		// ������� �������� �������
		for (int i = 1; i <= 10; i++) {
			// � ������ ������ ����� ���������� � ������� ������
			queue.push("������ " + i);
		}

		// ������ ��������� ��� ������. ������ ��������� � ��� �� �������, �
		// ������ ��������
		while (queue.size() > 0) {
			// ������ ������� ���������� ����, �.�. ����� ��� ��� ����� ������
			String s = (String) queue.pull();
			System.out.println(s);
			// System.out.println("Queue size is "+queue.size());
		}

		System.out.println("\n�������� ������ ������� \n");

		// ������� �������� �������
		for (int i = 1; i <= 10; i++) {
			// � ������ ������ ����� ���������� � ������� ������
			queue.push("������ " + i);
		}

		// ������ ��������� ��� ������. ������ ��������� � ��� �� �������, �
		// ������ ��������
		while (queue.size() > 0) {
			// ������ ������� ���������� ����, �.�. ����� ��� ��� ����� ������
			String s = (String) queue.pullBack();
			System.out.println(s);
			// System.out.println("Queue size is "+queue.size());
		}

	}
}
