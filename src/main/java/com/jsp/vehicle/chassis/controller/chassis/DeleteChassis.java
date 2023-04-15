package com.jsp.vehicle.chassis.controller.chassis;

import com.jsp.vehicle.chassis.dto.Chassis;
import com.jsp.vehicle.chassis.service.ChassisService;

public class DeleteChassis {

	public static void main(String[] args) {

		ChassisService chassisService = new ChassisService();
		Chassis chassis = chassisService.deleteChassis(7);
		if (chassis != null)
			System.out.println("Chassis Record Deleted");
	}
}
