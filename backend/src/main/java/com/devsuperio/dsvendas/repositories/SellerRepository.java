package com.devsuperio.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperio.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
