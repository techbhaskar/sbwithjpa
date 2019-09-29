package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Distributor;

@Repository
public interface DistributorRepository extends JpaRepository<Distributor, Long> {

	@Query(value = "SELECT * FROM Distributor WHERE distributorcode not in (select distributorcode from ItemDistributor where distributorcode=?1)", nativeQuery = true)
	List<Distributor> findDistributor(long i);

}
