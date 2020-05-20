//package com.example.demo.services.auth;
//
//import java.util.List;
//import javax.transaction.Transactional;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import com.example.demo.repositories.MstAuthRepository;
//import com.example.demo.entity.MstAuth;
//
///**
// * 権限マスタ一覧情報 Service
// */
//@Service
//public class MstAuthService {
//
//    /**
//    * ユーザー情報 Repository
//    */
//    @Autowired
//    private MstAuthRepository mstAuthRepository;
//
//    public List<MstAuth> searchAll() {
//        return mstAuthRepository.findAll();
//    }
//
//}