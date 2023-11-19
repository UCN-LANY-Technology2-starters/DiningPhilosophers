import java.util.Random;

public class Philosopher implements Runnable {

	String name;
	Chopstick left, right;
	Random rnd = new Random();

	public Philosopher(String name, Chopstick left, Chopstick right) {
		this.name = name;
		this.left = left;
		this.right = right;
	}

	@Override
	public void run() {
		// The never ending routine of thinking and eating
		while (true) {
			try {
				think();
//				System.out.println(name + " wants to eat.");
				left.pickUp();
				right.pickUp();
				eat();
//				System.out.println(name + " is finished eating.");
				left.putDown();
				right.putDown();
				
			} catch (InterruptedException ex) {
	            Thread.currentThread().interrupt();
	            return;
			}
		}
	}

	private void eat() throws InterruptedException {
		// eat a random length of time
		System.out.println(name + " is eating");
//		Thread.sleep((int) (Math.random() * 1000));
	}

	private void think() throws InterruptedException {
		// think a random length of time
		System.out.println(name + " is thinking");
//		Thread.sleep((int) (Math.random() * 1000));
	}
}
