package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.MstAuth;

@Repository
public interface MstAuthRepository extends JpaRepository<MstAuth, Long> {}