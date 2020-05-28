package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 情報 Entity
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="user")
public class User implements Serializable {
  /**
   * 社員ID
   */
  @Id
  @Column(name="user_id")
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long userId;
  /**
   * ユーザー名
   */
  @Column(name="user_name")
  private String userName;
  /**
   * パスワード
   */
  @Column(name="password")
  private String password;
  /**
   * 更新日時
   */
  @Column(name="update_date")
  private Date updateDate;
  /**
   * 登録日時
   */
  @Column(name="insert_date")
  private Date insertDate;
  /**
   * 削除日時
   */
  @Column(name="delete_date")
  private Date deleteDate;

//  public String getFirstName() { return userID; }

}