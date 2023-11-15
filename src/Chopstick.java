import java.util.concurrent.Semaphore;

public class Chopstick {

	int id;
	
	public Chopstick(int id) {
		this.id = id;
	}
	private Semaphore mutex = new Semaphore(1); // Note! Only one philosopher at a time can use the chopstick
	
	public void grab() {
		// TODO: Implement what happens when a philosopher graps the chopstick

	}
	
	public void putDown() {
		// TODO: Implement what happens when a philosopher puts down the chopstick

	}
	
	@Override
	public String toString() {
		return String.valueOf(id);
	}
}
