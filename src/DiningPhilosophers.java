
public class DiningPhilosophers {

	public static void main(String[] args) {

		Chopstick[] chopsticks = new Chopstick[5];
		
		for(int i = 0; i < 5; i++) {
			chopsticks[i] = new Chopstick(i+1);
		}
		
		for (int i = 0; i < 5; i++) {
			
			Chopstick left = chopsticks[i];
			Chopstick right = (i == 4) ? chopsticks[0] : chopsticks[i+1]; 
			
			Thread philosopher = new Thread(new Philosopher(left, right), "Philosopher "+ i);
			//philosopher.setDaemon(true);
			philosopher.start();			
		}		
		
		
	}
}
