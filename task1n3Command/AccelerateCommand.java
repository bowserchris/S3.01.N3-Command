package task1n3Command;

public class AccelerateCommand implements Command {
	
	Vehicle vehicle;
	
	public AccelerateCommand(Vehicle newVehicle) {
		this.vehicle = newVehicle;
	}

	@Override
	public void execute() {
		vehicle.accelerate();		
	}

}
