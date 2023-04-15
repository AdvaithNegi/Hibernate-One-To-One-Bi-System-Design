package com.jsp.vehicle.chassis.controller.chassis;

import com.jsp.vehicle.chassis.dto.Chassis;
import com.jsp.vehicle.chassis.service.ChassisService;

public class UpdateChassis {

	public static void main(String[] args) {

		Chassis chassis = new Chassis();
		chassis.setChassis_no("BM80WX10");

		ChassisService chassisService = new ChassisService();
		Chassis chassis2 = chassisService.updateChassis(chassis, 4);
		if (chassis2 != null)
			System.out.println("Chassis Record Added");
	}
}
