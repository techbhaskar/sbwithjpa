package com.example.demo.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.model.Item;
import com.example.demo.repository.DistributorRepository;
import com.example.demo.repository.ItemDistributorRepository;
import com.example.demo.repository.ItemRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoControllerTest {
	
	@MockBean
	ItemRepository itemRepository;
	@MockBean
	DistributorRepository distributorRepository;
	@MockBean
	ItemDistributorRepository itemDistributorRepository;
	
	private List<Item> items = new ArrayList<Item>();
	
	@Before
	private void init() {
		items.add(new Item(1,"Testing1","2020/08/10",1));
		items.add(new Item(2,"Testing2","2020/08/10",2));
		items.add(new Item(3,"Testing3","2020/08/10",3));
	}
	

	@Test
	public void testGetAllItems() {
		
		Mockito.when(itemRepository.findAll()).thenReturn(items);
		List<Item> itemsActucal = itemRepository.findAll();
		
		assertThat(itemsActucal).isEqualTo(items);
	}

	@Test
	public void testCreateItem() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetItemById() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllDistributors() {
		fail("Not yet implemented");
	}

	@Test
	public void testCreateDistributor() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDistributorId() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDistributors() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetItemDistributors() {
		fail("Not yet implemented");
	}

}
