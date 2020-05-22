package com.example.demo.services;

import java.util.List;
import lombok.RequiredArgsConstructor;
import javax.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.MstAuthRepository;
import com.example.demo.entity.MstAuth;

/**
 * 権限マスタ一覧情報 Service
 */
@Service
@RequiredArgsConstructor
@Transactional
public class MstAuthService {

/**
* 権限マスタ情報 Repository
*/

    private final MstAuthRepository mstAuthRepository;
//
//    public MstAuthService(MstAuthRepository mstAuthRepository) {
//        this.mstAuthRepository = mstAuthRepository;
//    }

    public List<MstAuth> searchAll() {
        return mstAuthRepository.findAll();
    }

}