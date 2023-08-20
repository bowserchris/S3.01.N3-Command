package task1n3Command;

public class BrakeCommand implements Command {
	
	Vehicle vehicle;
	
	public BrakeCommand(Vehicle newVehicle) {
		this.vehicle = newVehicle;
	}

	@Override
	public void execute() {
		vehicle.brake();		
	}

}