package task1n3Command;

public class Boat implements Vehicle {

	@Override
	public void start() {
		System.out.println("The boat is starting.");		
	}

	@Override
	public void accelerate() {
		System.out.println("The boat is accelerating.");			
	}

	@Override
	public void brake() {
		System.out.println("The boat is braking.");			
	}

}
