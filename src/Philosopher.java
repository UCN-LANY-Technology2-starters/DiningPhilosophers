
public class Philosopher implements Runnable {

	Chopstick left, right;

	public Philosopher(Chopstick left, Chopstick right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public void run() {

		while (true) {
			// TODO: Implement the never ending routine of:
			// thinking,
			// picking up chopsticks,
			// eating,
			// putting down chopsticks
		}
	}
}
