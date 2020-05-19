package com.example.demo.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repositories.MstAuthRepository;

/**
 * 権限マスタ一覧情報 Service
 */
@Service

public class MstAuthService {
    /**
     * ユーザー情報 Repository
     */
    @Autowired
    private MstAuthRepository userRepository;

    /**
     * ユーザー情報 全検索
     *
     * @return 検索結果
     */


}