package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

/**
 * 権限マスタ情報 Entity
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="mst_auth")
public class MstAuth implements Serializable {
    /**
     * 権限ID
     */
    @Id
    @Column(name="auth_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long auth_id;
    /**
     * 管理権限ステータス
     */
    @Column(name="status")
    private Integer status;
    /**
     * 管理権限名
     */
    @Column(name="status_name")
    private String statusName;
    /**
     * 機能ステータス
     */
    @Column(name="function_status")
    private Integer functionStatus;
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
}