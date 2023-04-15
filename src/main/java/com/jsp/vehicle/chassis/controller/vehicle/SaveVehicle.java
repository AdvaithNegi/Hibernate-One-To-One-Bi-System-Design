package com.jsp.vehicle.chassis.controller.vehicle;

import com.jsp.vehicle.chassis.dto.Vehicle;
import com.jsp.vehicle.chassis.service.VehicleService;

public class SaveVehicle {

	public static void main(String[] args) {

		Vehicle vehicle = new Vehicle();
		vehicle.setBrand("BMW");
		vehicle.setName("X7");
		vehicle.setColor("Black");
		vehicle.setPrice(5500000);

		VehicleService vehicleService = new VehicleService();
		Vehicle vehicle2 = vehicleService.saveVehicle(vehicle);
		if (vehicle2 != null)
			System.out.println("Vehicle Record Added");
	}
}
