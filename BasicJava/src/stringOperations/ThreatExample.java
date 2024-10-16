package stringOperations;

public class ThreatExample {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		t.setName("this is my Thread");
		t.setPriority(6);
		System.out.println(t);
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		

	}

}
