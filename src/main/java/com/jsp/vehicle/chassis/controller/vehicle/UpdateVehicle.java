package com.jsp.vehicle.chassis.controller.vehicle;

import com.jsp.vehicle.chassis.dto.Vehicle;
import com.jsp.vehicle.chassis.service.VehicleService;

public class UpdateVehicle {

	public static void main(String[] args) {

		Vehicle vehicle = new Vehicle();
		vehicle.setName("X1");
		vehicle.setColor("BLUE");
		vehicle.setPrice(8000000);

		VehicleService vehicleService = new VehicleService();
		Vehicle vehicle2 = vehicleService.updateVehicle(vehicle, 4);
		if (vehicle2 != null)
			System.out.println("Vehicle Record Updated");
	}

}
