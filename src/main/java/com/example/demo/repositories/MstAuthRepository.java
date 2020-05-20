package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.MstAuth;

/**
 * 権限マスタ情報 Repository
 */

@Repository
public class MstAuthRepository {
    public String findAll(){
        String Text = "テスト";
        return Text ;
    }

}
//public interface MstAuthRepository extends JpaRepository<MstAuth, Long> {}