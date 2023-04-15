package com.jsp.vehicle.chassis.controller.chassis;

import com.jsp.vehicle.chassis.service.ChassisService;

public class GetAllChassis {

	public static void main(String[] args) {

		ChassisService chassisService = new ChassisService();
		chassisService.getAllChassis();
	}
}
