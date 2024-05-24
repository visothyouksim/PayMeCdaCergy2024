package com.example.PayMe.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.PayMe.model.Transaction;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Long>{

}
