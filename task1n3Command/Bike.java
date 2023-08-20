package task1n3Command;

public class Bike implements Vehicle {

	@Override
	public void start() {
		System.out.println("The bike is starting.");		
	}

	@Override
	public void accelerate() {
		System.out.println("The bike is accelerating.");			
	}

	@Override
	public void brake() {
		System.out.println("The bike is braking.");			
	}

}
