package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.ItemNotFoundException;
import com.example.demo.model.Distributor;
import com.example.demo.model.Item;
import com.example.demo.model.ItemDistributor;
import com.example.demo.repository.DistributorRepository;
import com.example.demo.repository.ItemDistributorRepository;
import com.example.demo.repository.ItemRepository;

@RestController
public class DemoController {

	@Autowired
	ItemRepository itemRepository;
	@Autowired
	DistributorRepository distributorRepository;
	@Autowired
	ItemDistributorRepository itemDistributorRepository;

	// Get All Items
	@GetMapping("/items")
	public List<Item> getAllItems() {
		return itemRepository.findAll();
	}

	// Create a new Item
	@PostMapping("/items")
	public Item createItem(@Valid @RequestBody Item item) {
		return itemRepository.save(item);
	}

	// Get a Single Item
	@GetMapping("/items/{itemcode}")
	public Item getItemById(@PathVariable(value = "itemcode") long itemcode) throws ItemNotFoundException {
		return itemRepository.findOne(itemcode);
	}

	// Get All Distributors
	@GetMapping("/distributors")
	public List<Distributor> getAllDistributors() {
		return distributorRepository.findAll();
	}

	// Create a new Distributor
	@PostMapping("/distributors")
	public Distributor createDistributor(@Valid @RequestBody Distributor distributor) {
		return distributorRepository.save(distributor);
	}

	// Get a Single Distributor
	@GetMapping("/distributors/{distributorcode}")
	public Distributor getDistributorId(@PathVariable(value = "distributorcode") long distributorcode)
			throws ItemNotFoundException {
		return distributorRepository.findOne(distributorcode);
	}

	// Get All Distributors
	@GetMapping("/finddistributors/{distributorcode}")
	public List<Distributor> getDistributors(@PathVariable(value = "distributorcode") long distributorcode) {
		return distributorRepository.findDistributor(distributorcode);
	}

	// Get All ItemDistributors
	@GetMapping("/itemdist")
	public List<ItemDistributor> getItemDistributors() {
		return itemDistributorRepository.getItemDistributors();
	}

}
