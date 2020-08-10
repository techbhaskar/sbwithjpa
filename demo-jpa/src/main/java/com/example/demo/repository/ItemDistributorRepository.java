package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ItemDistributor;

@Repository
public interface ItemDistributorRepository extends JpaRepository<ItemDistributor, Long> {

	@Query(value = "select i.itemcode,d.distributorcode from Item i left join Distributor d on d.AuditId = i.auditId", nativeQuery = true)
	List<ItemDistributor> getItemDistributors();

}
