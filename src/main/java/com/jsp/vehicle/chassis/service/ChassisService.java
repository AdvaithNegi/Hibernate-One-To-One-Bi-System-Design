package com.jsp.vehicle.chassis.service;

import com.jsp.vehicle.chassis.dao.ChassisDao;
import com.jsp.vehicle.chassis.dto.Chassis;

public class ChassisService {

	ChassisDao chassisDao = new ChassisDao();

	// Save Chassis
	public Chassis saveChassis(Chassis chassis) {
		return chassisDao.saveChassis(chassis);
	}

	// Get By Id Chassis
	public Chassis getByIdChassis(int id) {
		return chassisDao.getByIdChassis(id);
	}

	// Update Chassis
	public Chassis updateChassis(Chassis chassis, int id) {
		Chassis chassis2 = chassisDao.getByIdChassis(id);
		if (chassis.getChassis_no() != null)
			chassis2.setChassis_no(chassis.getChassis_no());
		if (chassis2 != null)
			return chassisDao.updateChassis(chassis2);

		return null;
	}

	// Delete Chassis
	public Chassis deleteChassis(int id) {
		Chassis chassis = chassisDao.getByIdChassis(id);
		if (chassis != null)
			return chassisDao.deleteChassis(chassis);

		return null;
	}

	// Get All Chassis
	public void getAllChassis() {
		chassisDao.getAllChassis();
	}

}
