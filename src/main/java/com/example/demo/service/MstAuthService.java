package com.example.demo.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import javax.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.MstAuthRepository;
import com.example.demo.entity.MstAuth;

/**
 * 権限マスタ一覧情報 Service
 */
@Service
@Transactional(rollbackOn = Exception.class)
public class MstAuthService {

/**
* 権限マスタ情報 Repository
*/
@Autowired
private MstAuthRepository mstAuthRepository;

    public List<MstAuth> searchAll() {
        return mstAuthRepository.findAll();
    }

}