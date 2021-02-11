package com.rmf.financial.api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rmf.financial.api.entities.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

	List<Transaction> findAllByOrderByDateAsc();
}
