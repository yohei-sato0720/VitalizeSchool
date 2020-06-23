package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Transaction;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * 取引履歴情報 Repository
 */

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    public Page<Transaction> findAll(Pageable pageable);
}
