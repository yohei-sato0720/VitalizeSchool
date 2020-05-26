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
  private Long user_id;
  /**
   * 社員コード
   */
  @Column(name="user_code")
  private Integer user_code;
  /**
   * パスワード
   */
  @Column(name="password")
  private String password;
  /**
   * 支店コード
   */
  @Column(name="function_status")
  private Integer functionStatus;
  /**
   * 役職コード
   */
  @Column(name="position_code")
  private String positionCode;
  /**
   * 業務コード
   */
  @Column(name="business_code")
  private String businessCode;
  /**
   * 管理権限ステータス
   */
  @Column(name="effective_date")
  private String effectiveDate;
  /**
   * 更新日時
   */
  @Column(name="update_date")
  private Date updateDate;
  /**
   * 登録日時
   */
  @Column(name="create_date")
  private Date createDate;
  /**
   * 削除日時
   */
  @Column(name="delete_date")
  private Date deleteDate;

//  public String getFirstName() { return userID; }

}