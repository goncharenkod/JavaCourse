package Queue;

public class ObjectQueue {

	private ObjectBox head = null;
	private ObjectBox tail = null;

	private int size = 0;

	public void push(Object obj) {

		// ����� �������� ������� ������� � �������� � ��� ���������� ������
		ObjectBox ob = new ObjectBox();
		ob.setObject(obj);

		// ���� ������� ������, �� ������ ����� ����� ��������� �� ��� ������
		if (head == null) {
			head = ob;
		} else {
			// �������� ���� � ��� �������� �����
			// ObjectBox tmpTail = tail;
			// ���� �� ������, �� � ���������� �������� �� ��������� tail ������
			// �� ��� �������
			tail.setNext(ob);
			// � ������ �������� ��������� ����������� �������� ��� ������ �����
			ob.setPrev(tail);
		}

		// � � ����� ������ ����� ����� ��������� �� ��� ������
		tail = ob;

		// ����������� ������ ������
		size++;

	}

	public Object pull() {

		// ���� ������ ������ - ���������� null
		if (size == 0) {
			return null;
		}

		// ���� ��� ����� ������� � ������ � ������������� ���
		Object obj = head.getObject();

		// ������ ���������� �� ��������� �������
		head = head.getNext();

		// ���� ��� ��� ��������� �������, �� head ������ null/ ������� � �����
		// ������ ����� null
		if (head == null) {
			tail = null;
		}

		// ��������� ������ �������
		size--;

		return obj;
	}

	public Object pullBack() {

		// ���� ������ ������ - ���������� null
		if (size == 0) {
			return null;
		}

		// ���� ��� ����� ������� � ������ � ������������� ���
		Object obj = tail.getObject();

		// ������ ���������� �� ��������� �������
		tail = tail.getPrev();

		// ���� ��� ��� ��������� �������, �� tail ������ null/ ������� � ������
		// ������ ����� null
		if (tail == null) {
			head = null;
		}

		// ��������� ������ �������
		size--;

		return obj;
	}

	public int size() {
		return size;
	}

	public Object get(int index) {

		ObjectBox curObj;

		if (size == 0 || index > size || index < 0) {
			return null;
		}

		if (index < size / 2) {

			curObj = head;
			int pos = 0;

			while (pos < index) {
				curObj = curObj.getNext();
				pos++;
			}
		} else {
			curObj = tail;
			int pos = size;

			while (pos > index) {
				curObj = curObj.getPrev();
				pos--;
			}
		}

		Object obj = curObj.getObject();

		return obj;

	}

	private class ObjectBox {

		private Object object;
		private ObjectBox next;
		private ObjectBox prev;

		public Object getObject() {
			return object;
		}

		public void setObject(Object object) {
			this.object = object;
		}

		public ObjectBox getNext() {
			return next;
		}

		public ObjectBox getPrev() {
			return prev;
		}

		public void setNext(ObjectBox next) {
			this.next = next;
		}

		public void setPrev(ObjectBox prev) {
			this.prev = prev;
		}
	}

}