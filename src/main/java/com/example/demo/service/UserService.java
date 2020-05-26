package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * 権限一覧情報 Service
 */
@Service
@Transactional(rollbackOn = Exception.class)
public class UserService {

/**
* 権限情報 Repository
*/
@Autowired
private UserRepository userRepository;
    // 権限の内容を全検索
    public List<User> searchAll() {
        return userRepository.findAll();
    }

}