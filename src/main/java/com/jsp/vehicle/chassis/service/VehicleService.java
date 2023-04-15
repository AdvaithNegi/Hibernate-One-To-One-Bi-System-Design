package com.jsp.vehicle.chassis.service;

import com.jsp.vehicle.chassis.dao.VehicleDao;
import com.jsp.vehicle.chassis.dto.Vehicle;

public class VehicleService {

	VehicleDao vehicleDao = new VehicleDao();

	// Save Vehicle
	public Vehicle saveVehicle(Vehicle vehicle) {
		return vehicleDao.saveVehicle(vehicle);
	}

	// Get By Id Vehicle
	public Vehicle getByIdVehicle(int id) {
		return vehicleDao.getByIdVehicle(id);
	}

	// Update Vehicle
	public Vehicle updateVehicle(Vehicle vehicle, int id) {
		Vehicle vehicle2 = vehicleDao.getByIdVehicle(id);
		if (vehicle.getBrand() != null)
			vehicle2.setBrand(vehicle.getBrand());
		if (vehicle.getName() != null)
			vehicle2.setName(vehicle.getName());
		if (vehicle.getColor() != null)
			vehicle2.setColor(vehicle.getColor());
		if (vehicle.getPrice() != 0)
			vehicle2.setPrice(vehicle.getPrice());
		if (vehicle2 != null)
			return vehicleDao.updateVehicle(vehicle2);

		return null;
	}

	// Delete Vehicle
	public Vehicle deleteVehicle(int id) {
		Vehicle vehicle = vehicleDao.getByIdVehicle(id);
		if (vehicle != null)
			return vehicleDao.deleteVehicle(vehicle);

		return null;
	}

	// Get All Vehicles
	public void getAllVehicles() {
		vehicleDao.getAllVehicles();
	}

}
