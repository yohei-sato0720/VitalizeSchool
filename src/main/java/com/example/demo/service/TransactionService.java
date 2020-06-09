package com.example.demo.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import javax.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.TransactionRepository;
import com.example.demo.entity.Transaction;

/**
 * 取引履歴機能 一覧画面表示 Service
 */
@Service
@Transactional(rollbackOn = Exception.class)
public class TransactionService {

/**
* 取引履歴機能 Repository
*/
@Autowired
private TransactionRepository transactionRepository;
    // 取引履歴機能の内容を全検索
    public List<Transaction> searchAll() {
        return transactionRepository.findAll();
    }

//    public Transaction findOne(Long id) {
//        return transactionRepository.findById(id).orElse(null);
//    }

    public Transaction save(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

}