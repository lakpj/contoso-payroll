package com.contoso.payroll;

import org.springframework.data.repository.Repository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import org.springframework.data.jpa.repository.JpaRepository;

// @RepositoryRestResource(exported = false)
// public interface ManagerRepository extends Repository<Manager, Long> {

// 	Manager save(Manager manager);

// 	Manager findByName(String name);

// }

@RepositoryRestResource(exported = false)
public interface ManagerRepository extends JpaRepository<Manager, Long> {

	Manager save(Manager manager);

	Manager findByName(String name);

}
