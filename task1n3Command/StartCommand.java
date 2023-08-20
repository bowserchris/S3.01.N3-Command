package task1n3Command;

public class StartCommand implements Command {
	
	Vehicle vehicle;
	
	public StartCommand(Vehicle newVehicle) {
		this.vehicle = newVehicle;
	}

	@Override
	public void execute() {
		vehicle.start();		
	}

}
