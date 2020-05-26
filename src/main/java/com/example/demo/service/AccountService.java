package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Account;
import com.example.demo.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
    private AccountRepository accountRepository;

    public List<Account> findAll() {
        return accountRepository.findAll();
    }

    public Account findOne(Long id) {
        return accountRepository.findById(id).orElse(null);
    }

    public Account save(Account account) {
        return accountRepository.save(account);
    }

    public void delete(Long id) {
    	accountRepository.deleteById(id);
    }

}