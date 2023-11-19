public class Chopstick {

	int id;
	boolean inUse;

	public Chopstick(int id) {
		this.id = id;
	}

	public void pickUp() {

		while (inUse) {
			// wait
		}
		inUse = true;
	}

	public void putDown() {

		inUse = false;
	}

	@Override
	public String toString() {
		return String.valueOf(id);
	}
}
