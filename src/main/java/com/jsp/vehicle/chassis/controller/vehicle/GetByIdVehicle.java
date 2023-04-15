package com.jsp.vehicle.chassis.controller.vehicle;

import com.jsp.vehicle.chassis.dao.VehicleDao;
import com.jsp.vehicle.chassis.dto.Vehicle;

public class GetByIdVehicle {

	public static void main(String[] args) {

		VehicleDao vehicleDao = new VehicleDao();
		Vehicle vehicle = vehicleDao.getByIdVehicle(1);

		System.out.println("Vehicle ID         : " + vehicle.getId());
		System.out.println("Vehicle Brand      : " + vehicle.getBrand());
		System.out.println("Vehicle Name       : " + vehicle.getName());
		System.out.println("Vehicle Color      : " + vehicle.getColor());
		System.out.println("Vehicle Price      : " + vehicle.getPrice());
		System.out.println("Vehicel Chassis_no : " + vehicle.getChassis().getChassis_no());
	}

}
