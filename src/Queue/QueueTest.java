package Queue;

public class QueueTest {

	public static void main(String[] args) {

		ObjectQueue queue = new ObjectQueue();

		System.out.println("ПРЯМОЙ ПРОХОД ОЧЕРЕДИ \n");

		// сначала заполним очередь
		for (int i = 1; i <= 10; i++) {
			// в данном случае будем складывать в очередь строки
			queue.push("Строка " + i);
		}

		// теперь извлекаем эти строки. должны извлечься в том же порядке, в
		// которм положили
		while (queue.size() > 0) {
			// делаем жесткое приведение типа, т.к. знаем что там лежат строки
			String s = (String) queue.pull();
			System.out.println(s);
			// System.out.println("Queue size is "+queue.size());
		}

		System.out.println("\nОБРАТНЫЙ ПРОХОД ОЧЕРЕДИ \n");

		// сначала заполним очередь
		for (int i = 1; i <= 10; i++) {
			// в данном случае будем складывать в очередь строки
			queue.push("Строка " + i);
		}

		// теперь извлекаем эти строки. должны извлечься в том же порядке, в
		// которм положили
		while (queue.size() > 0) {
			// делаем жесткое приведение типа, т.к. знаем что там лежат строки
			String s = (String) queue.pullBack();
			System.out.println(s);
			// System.out.println("Queue size is "+queue.size());
		}

	}
}
