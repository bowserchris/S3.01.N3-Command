package task1n3Command;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		boolean exit = false;
		Vehicle vehicle;
		
		do {

		vehicle = ParkingLot.getVehicle(inputString("What type of vehicle would you like to maneuouver? car, bike, plane or boat?"));
		
		if (vehicle != null) {
			exit = true;
		}
		
		} while (!exit);
		
		StartCommand startcommand = new StartCommand(vehicle);
		
		VehicleParking parkingLot = new VehicleParking(startcommand);
		
		parkingLot.driving();
		
		/////////////////////////
		
		AccelerateCommand acceleratecommand = new AccelerateCommand(vehicle);

		parkingLot = new VehicleParking(acceleratecommand);

		parkingLot.driving();
		
		///////////////////////////
		
		BrakeCommand brakecommand = new BrakeCommand(vehicle);

		parkingLot = new VehicleParking(brakecommand);

		parkingLot.driving();

	}
	
	static String inputString(String message) {				//request a string input
		Scanner input = new Scanner(System.in);
		System.out.println(message);
		return input.nextLine();
	}

}
