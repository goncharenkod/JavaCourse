package Queue;

public class ObjectQueue {

	private ObjectBox head = null;
	private ObjectBox tail = null;

	private int size = 0;

	public void push(Object obj) {

		// сразу создадим коробку объекта и поместим в нее полученный объект
		ObjectBox ob = new ObjectBox();
		ob.setObject(obj);

		// если очередь пустая, то голова сразу будет указывать на наш объект
		if (head == null) {
			head = ob;
		} else {
			// запомним куда у нас указывал хвост
			// ObjectBox tmpTail = tail;
			// если не пустая, то у последнего элемента мы указатель tail ставим
			// на наш элемент
			tail.setNext(ob);
			// у нового элемента указатель предыдущего элемента это старый хвост
			ob.setPrev(tail);
		}

		// и в любом случае хвост будет указывать на наш объект
		tail = ob;

		// увеличиваем размер списка
		size++;

	}

	public Object pull() {

		// если список пустой - возвращаем null
		if (size == 0) {
			return null;
		}

		// если нет берем элемент с головы и распаковываем его
		Object obj = head.getObject();

		// голову перемещаем на следующий элемент
		head = head.getNext();

		// если это был последний элемент, то head станет null/ Значить и хвост
		// должен стать null
		if (head == null) {
			tail = null;
		}

		// уменьшаем размер очереди
		size--;

		return obj;
	}

	public Object pullBack() {

		// если список пустой - возвращаем null
		if (size == 0) {
			return null;
		}

		// если нет берем элемент с хвоста и распаковываем его
		Object obj = tail.getObject();

		// голову перемещаем на следующий элемент
		tail = tail.getPrev();

		// если это был последний элемент, то tail станет null/ Значить и голова
		// должна стать null
		if (tail == null) {
			head = null;
		}

		// уменьшаем размер очереди
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