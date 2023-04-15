package com.jsp.vehicle.chassis.controller.vehicle;

import com.jsp.vehicle.chassis.dto.Chassis;
import com.jsp.vehicle.chassis.dto.Vehicle;
import com.jsp.vehicle.chassis.service.ChassisService;
import com.jsp.vehicle.chassis.service.VehicleService;

public class DeleteVehicle {

	public static void main(String[] args) {

		ChassisService chassisService = new ChassisService();
		Chassis chassis = chassisService.deleteChassis(6);
		if (chassis != null)
			System.out.println("Chassis Record Deleted");

		VehicleService vehicleService = new VehicleService();
		Vehicle vehicle = vehicleService.deleteVehicle(6);
		if (vehicle != null)
			System.out.println("Vehicle Record Deleted");
	}
}
