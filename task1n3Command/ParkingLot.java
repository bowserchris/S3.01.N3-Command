package task1n3Command;

public class ParkingLot {
	
	public static Vehicle getVehicle(String typeOfVehicle) {
		switch (typeOfVehicle) {
			case "car":
				return new Car();
			case "bike":
				return new Bike();
			case "boat":
				return new Boat();
			case "plane":
				return new Plane();
			default: 
				System.out.println("Try again and careful of your spelling.");
				return null;

		}
	}
}
		
		/*
		if (typeOfVehicle.equalsIgnoreCase("car")) {
			
		} else if(typeOfVehicle.equalsIgnoreCase("bike")) {
			return new Bike();
		} else if(typeOfVehicle.equalsIgnoreCase("boat")) {
			return new Boat();
		} else if(typeOfVehicle.equalsIgnoreCase("plane")) {
			return new Plane();
		}
		return null;
	}*/

