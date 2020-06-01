package com.example.demo.service;

import com.example.demo.entity.MstUser;
import com.example.demo.repository.MstUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional(rollbackOn = Exception.class)
public class MstUserService {

  @Autowired
  private MstUserRepository mstUserRepository;

    public List<MstUser> searchAll() {
          return mstUserRepository.findAll();
      }

    public List<MstUser> search(Integer userNumber, Integer userName, String branchCode) {
      List<MstUser> result = mstUserRepository.findAll();
      return result;
    }

  public MstUser findOne(Long id) {
    return mstUserRepository.findById(id).orElse(null);
  }

  public MstUser save(MstUser mstUser) {
      return mstUserRepository.save(mstUser);
  }

  public void delete(Long id) {
    mstUserRepository.deleteById(id);
  }

}