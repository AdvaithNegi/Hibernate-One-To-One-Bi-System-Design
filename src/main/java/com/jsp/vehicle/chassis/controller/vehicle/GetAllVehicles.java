package com.jsp.vehicle.chassis.controller.vehicle;

import com.jsp.vehicle.chassis.service.VehicleService;

public class GetAllVehicles {

	public static void main(String[] args) {

		VehicleService vehicleService = new VehicleService();
		vehicleService.getAllVehicles();

	}
}
