public class Example {
	public static void main(String[] args) {
		Itarget target = new Adapter(new Adaptee());
		target.request();
	}
	
	
}

interface Itarget {
	void request();
}

class Adapter implements Itarget {
	
	private final Adaptee adaptee;
	
	Adapter (Adaptee adaptee) {
		this.adaptee = adaptee;
	}
	
	public void request() {
		adaptee.speicalRequest();
	}

}

class Adaptee {
	public void speicalRequest() {
		System.out.println("Woow, that was magical");
	}
}