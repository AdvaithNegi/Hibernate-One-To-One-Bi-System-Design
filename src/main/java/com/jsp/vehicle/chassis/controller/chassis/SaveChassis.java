package com.jsp.vehicle.chassis.controller.chassis;

import com.jsp.vehicle.chassis.dto.Chassis;
import com.jsp.vehicle.chassis.dto.Vehicle;
import com.jsp.vehicle.chassis.service.ChassisService;
import com.jsp.vehicle.chassis.service.VehicleService;

public class SaveChassis {

	public static void main(String[] args) {

		VehicleService vehicleService = new VehicleService();
		Vehicle vehicle = vehicleService.getByIdVehicle(6);

		Chassis chassis = new Chassis();
		chassis.setChassis_no("BM55WX70");
		chassis.setVehicle(vehicle);

		ChassisService chassisService = new ChassisService();
		Chassis chassis2 = chassisService.saveChassis(chassis);
		if (chassis2 != null)
			System.out.println("Chassis Record Added");
	}
}
