package Stack;

public class StackTest {

	public static void main(String[] args) {
		
		ObjectStack stack1 = new ObjectStack(5);
		
		// сначала заполним очередь
		for (int i=1; i<=10; i++) {
			// в данном случае будем складывать в очередь строки
			stack1.push("Строка "+i );
		}
		
		// теперь извлекаем эти строки. должны извлечься в том же порядке, в которм положили
		while (stack1.size() > 0) {
			// делаем жесткое приведение типа, т.к. знаем что там лежат строки
			String s = (String)stack1.pull();
			System.out.println(s);
			System.out.println("Queue size is "+stack1.size());
		}
	}
}
