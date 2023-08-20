package task1n3Command;

public class VehicleParking {
	
	Command theCommand;
	
	public VehicleParking(Command newCommand) {
		this.theCommand = newCommand;
	}
	
	public void driving() {
		theCommand.execute();
	}
	
}
