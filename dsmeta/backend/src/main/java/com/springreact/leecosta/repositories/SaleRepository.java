package com.springreact.leecosta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springreact.leecosta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
