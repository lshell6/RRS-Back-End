package com.backend.reward.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.reward.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{

}
