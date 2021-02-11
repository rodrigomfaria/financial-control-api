package com.rmf.financial.api.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rmf.financial.api.dto.TransactionDTO;
import com.rmf.financial.api.entities.Transaction;
import com.rmf.financial.api.repositories.TransactionRepository;

@Service
public class TransactionService {

	@Autowired
	private TransactionRepository repository;

	@Transactional(readOnly = true)
	public List<TransactionDTO> findAll() {
		List<Transaction> list = repository.findAllByOrderByDateAsc();
		return list.stream().map(x -> new TransactionDTO(x)).collect(Collectors.toList());
	}

	@Transactional(readOnly = true)
	public TransactionDTO findById(Long id) {
		Optional<Transaction> transaction = repository.findById(id);
		return new TransactionDTO(transaction.get());
	}

	@Transactional
	public TransactionDTO insert(TransactionDTO dto) {
		Transaction transaction = new Transaction(null, dto.getDescription(), dto.getType(), dto.getDate(),
				dto.getTotal());
		transaction = repository.save(transaction);
		return new TransactionDTO(transaction);
	}

	@Transactional
	public TransactionDTO delete(Long id) {
		TransactionDTO dto = findById(id);
		repository.deleteById(id);
		return dto;
	}

	@Transactional
	public TransactionDTO update(Long id, TransactionDTO dto) {
		Transaction transaction = new Transaction(id, dto.getDescription(), dto.getType(), dto.getDate(), dto.getTotal());
		repository.save(transaction);
		return new TransactionDTO(transaction);
	}

}
