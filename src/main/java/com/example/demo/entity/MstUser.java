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
@Table(name="mst_user")
public class MstUser implements Serializable {
  /**
   * 社員ID
   */
  @Id
  @Column(name="mst_user_id")
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long mstUserId;

  /**
   * 社員名前
   */
  @Column(name="user_name")
  private String userName;

  /**
   * 社員コード
   */
  @Column(name="user_code")
  private Integer userCode;
  /**
   * パスワード
   */
  @Column(name="password")
  private String password;
  /**
   * 支店コード
   */
  @Column(name="status")
  private Integer status;
  /**
   * 支店コード
   */
  @Column(name="branch_code")
  private Integer branchCode;

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
  @Column(name="insert_date")
  private Date insertDate;
  /**
   * 削除日時
   */
  @Column(name="delete_date")
  private Date deleteDate;

//  public String getFirstName() { return userID; }

}