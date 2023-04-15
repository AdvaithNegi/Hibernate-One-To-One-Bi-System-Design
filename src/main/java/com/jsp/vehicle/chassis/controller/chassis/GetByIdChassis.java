package com.jsp.vehicle.chassis.controller.chassis;

import com.jsp.vehicle.chassis.dto.Chassis;
import com.jsp.vehicle.chassis.service.ChassisService;

public class GetByIdChassis {

	public static void main(String[] args) {

		ChassisService chassisService = new ChassisService();
		Chassis chassis = chassisService.getByIdChassis(1);

		System.out.println("Chassis ID          : " + chassis.getId());
		System.out.println("Chassis Chassis_no  : " + chassis.getChassis_no());
		System.out.println("Vehicle Brand       : " + chassis.getVehicle().getBrand());
		System.out.println("Vehicle Name        : " + chassis.getVehicle().getName());
		System.out.println("Vehicle Color       : " + chassis.getVehicle().getColor());
		System.out.println("Vehicle Price       : " + chassis.getVehicle().getPrice());

	}
}
