package com.example.demo.repository;

import com.example.demo.entity.MstUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 権限マスタ情報 Repository
 */

@Repository
public interface MstUserRepository extends JpaRepository<MstUser, Long> {}
