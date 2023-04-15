package com.jsp.vehicle.chassis.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.vehicle.chassis.dto.Vehicle;

public class VehicleDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("advaith");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	// Save Record
	public Vehicle saveVehicle(Vehicle vehicle) {
		if (vehicle != null) {
			entityTransaction.begin();
			entityManager.persist(vehicle);
			entityTransaction.commit();
			return vehicle;
		}
		return null;
	}

	// Get By Id Record
	public Vehicle getByIdVehicle(int id) {
		return entityManager.find(Vehicle.class, id);
	}

	// Update Record
	public Vehicle updateVehicle(Vehicle vehicle) {
		if (vehicle != null) {
			entityTransaction.begin();
			entityManager.merge(vehicle);
			entityTransaction.commit();
			return vehicle;
		}
		return null;
	}

	// Delete Record
	public Vehicle deleteVehicle(Vehicle vehicle) {
		if (vehicle != null) {
			entityTransaction.begin();
			entityManager.remove(vehicle);
			entityTransaction.commit();
			return vehicle;
		}
		return null;
	}

	// Get All Records
	public void getAllVehicles() {
		String sql = "select v from Vehicle v";
		Query query = entityManager.createQuery(sql);
		List<Vehicle> vehicles = query.getResultList();
		for (Vehicle vehicle : vehicles) {
			System.out.println("=================================================================");
			System.out.println("Vehicle ID         : " + vehicle.getId());
			System.out.println("Vehicle Brand      : " + vehicle.getBrand());
			System.out.println("Vehicle Name       : " + vehicle.getName());
			System.out.println("Vehicle Color      : " + vehicle.getColor());
			System.out.println("Vehicle Price      : " + vehicle.getPrice());
			System.out.println("Vehicel Chassis_no : " + vehicle.getChassis().getChassis_no());
		}
	}

}
