package BoECdemo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import BoECdemo.models.Transaction;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Integer>{

}
