package Stack;

public class ObjectStack {

	private ObjectBox head = null;
	
	private int size = 0;
	// Максимальный размер стека
	private int maxSize = 1;
	
	// Конструктор инициализирует стек заданного размера
	public ObjectStack(int maxSize) {
		this.maxSize = maxSize; 
	}
	
	public void push(Object obj) {
		
		if (size == maxSize) {
			System.out.println("stack's Max size reached");
			return;
		}
		// сразу создадим коробку объекта и поместим в нее полученный объект
		ObjectBox ob = new ObjectBox();
		ob.setObject(obj);
		
		// если очередь пустая, то в новом объекте указатель предыдущего элемента берем старую голову
		if (head != null) {
			ob.setPrev(head);
		} 
		
		// и в любом случае новая голова будет указывать на наш объект
		head = ob;
		
		// увеличиваем размер стека 
		size++;
	}


	public Object pull() {
		
		// если стек пустой - возвращаем null 
		if (size == 0) {
			return null;
		}
		
		// если нет берем элемент с головы и распаковываем его
		Object obj = head.getObject();
		
		// голову перемещаем на следующий элемент
		head = head.getPrev();
		
		// уменьшаем размер очереди
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
