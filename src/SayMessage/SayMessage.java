package SayMessage;

public class SayMessage	 {
	
	private static String message;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world!!!");
		
		sayMessage("Mesage by argument");
		
		setMessage("message variable set to this sentence");
		
		sayMessage();
	}
	
	public static void setMessage(String mes) {
		message = mes;
	}
	public static void sayMessage(String mes) {
		
		System.out.println(mes);
		
	}
	
	public static void sayMessage() {
		
		System.out.println(message);
	}
}
