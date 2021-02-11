package com.rmf.financial.api.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.rmf.financial.api.entities.Transaction;
import com.rmf.financial.api.entities.TransactionType;

public class TransactionDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String description;
	private TransactionType type;
	private Date date;
	private BigDecimal total;

	public TransactionDTO() {
	}

	public TransactionDTO(Long id, String description, TransactionType type, Date date, BigDecimal total) {
		this.id = id;
		this.description = description;
		this.type = type;
		this.date = date;
		this.total = total;
	}

	public TransactionDTO(Transaction entity) {
		id = entity.getId();
		description = entity.getDescription();
		type = entity.getType();
		date = entity.getDate();
		total = entity.getTotal();
	}

	public Long getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public TransactionType getType() {
		return type;
	}

	public Date getDate() {
		return date;
	}

	public BigDecimal getTotal() {
		return total;
	}

}
