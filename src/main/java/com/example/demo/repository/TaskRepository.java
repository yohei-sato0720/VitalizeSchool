package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Task;

/**
 * 取引履歴情報 Repository
 */

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {}
