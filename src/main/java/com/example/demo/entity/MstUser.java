package com.example.demo.entity;

import lombok.*;

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
   * 社員　名字
   */
  @Column(name="first_name")
  private String firstName;

  /**
   * 社員　名前
   */
  @Column(name="last_name")
  private String lastName;

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
   * 登録者
   */
  @Column(name="insert_user_id")
  private Integer insertUserId;

  /**
   * 更新者
   */
  @Column(name="update_user_id")
  private Integer updateUserId;

  /**
   * 登録日時
   */
  @Column(name="insert_date", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
  private Date insertDate;

  /**
   * 更新日時
   */
  @Column(name="update_date")
  private Date updateDate;

  /**
   * 削除日時
   */
  @Column(name="delete_date")
  private Date deleteDate;

  private int insertmstUserId;

  public void setInsertmstUserId(int insertmstUserId) {
    this.insertmstUserId = insertmstUserId;
  }

  @PrePersist
  public void onPrePersist() {
    setInsertDate(new Date());
    setUpdateDate(new Date());
  }

  @PreUpdate
  public void onPreUpdate() {
    setUpdateDate(new Date());
  }

}