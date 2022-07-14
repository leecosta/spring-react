package com.springreact.leecosta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springreact.leecosta.entities.Sale;
import com.springreact.leecosta.repositories.SaleRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;

	public List<Sale> findSales() {
		return repository.findAll();
	}
}
