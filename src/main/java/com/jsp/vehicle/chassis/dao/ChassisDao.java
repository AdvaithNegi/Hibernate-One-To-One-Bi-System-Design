package com.jsp.vehicle.chassis.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.vehicle.chassis.dto.Chassis;

public class ChassisDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("advaith");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	// Save Record
	public Chassis saveChassis(Chassis chassis) {
		if (chassis != null) {
			entityTransaction.begin();
			entityManager.persist(chassis);
			entityTransaction.commit();
			return chassis;
		}
		return null;
	}

	// Get By Id Record
	public Chassis getByIdChassis(int id) {
		return entityManager.find(Chassis.class, id);
	}

	// Update Record
	public Chassis updateChassis(Chassis chassis) {
		if (chassis != null) {
			entityTransaction.begin();
			entityManager.merge(chassis);
			entityTransaction.commit();
			return chassis;
		}
		return null;
	}

	// Delete Record
	public Chassis deleteChassis(Chassis chassis) {
		if (chassis != null) {
			entityTransaction.begin();
			entityManager.remove(chassis);
			entityTransaction.commit();
			return chassis;
		}
		return null;
	}

	// Get All Records
	public void getAllChassis() {
		String sql = "select c from Chassis c";
		Query query = entityManager.createQuery(sql);
		List<Chassis> chassis1 = query.getResultList();
		for (Chassis chassis : chassis1) {
			System.out.println("===================================================================");
			System.out.println("Chassis ID          : " + chassis.getId());
			System.out.println("Chassis Chassis_no  : " + chassis.getChassis_no());
			System.out.println("Vehicle Brand       : " + chassis.getVehicle().getBrand());
			System.out.println("Vehicle Name        : " + chassis.getVehicle().getName());
			System.out.println("Vehicle Color       : " + chassis.getVehicle().getColor());
			System.out.println("Vehicle Price       : " + chassis.getVehicle().getPrice());

		}
	}

}
