package Stack;

public class ObjectStack {

	private ObjectBox head = null;
	
	private int size = 0;
	// ������������ ������ �����
	private int maxSize = 1;
	
	// ����������� �������������� ���� ��������� �������
	public ObjectStack(int maxSize) {
		this.maxSize = maxSize; 
	}
	
	public void push(Object obj) {
		
		if (size == maxSize) {
			System.out.println("stack's Max size reached");
			return;
		}
		// ����� �������� ������� ������� � �������� � ��� ���������� ������
		ObjectBox ob = new ObjectBox();
		ob.setObject(obj);
		
		// ���� ������� ������, �� � ����� ������� ��������� ����������� �������� ����� ������ ������
		if (head != null) {
			ob.setPrev(head);
		} 
		
		// � � ����� ������ ����� ������ ����� ��������� �� ��� ������
		head = ob;
		
		// ����������� ������ ����� 
		size++;
	}


	public Object pull() {
		
		// ���� ���� ������ - ���������� null 
		if (size == 0) {
			return null;
		}
		
		// ���� ��� ����� ������� � ������ � ������������� ���
		Object obj = head.getObject();
		
		// ������ ���������� �� ��������� �������
		head = head.getPrev();
		
		// ��������� ������ �������
		size--;
		
		return obj;
	}
	
	public int size() {
		return size;
	}
	
	
	private class ObjectBox {
		
		private Object object;
		private ObjectBox prev;
		
		public Object getObject() {
			return object;
		}
		
		public void setObject(Object object) {
			this.object = object;
		}
		
		public ObjectBox getPrev() {
			return prev;
		}
		
		public void setPrev(ObjectBox prev) {
			this.prev = prev;
		}
		
	}

}
