package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

/**
 *口座機能 Entity
 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "account")
public class Account implements Serializable {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id")
    private Long accountId;

	@Size(max = 7)
	@NotNull
    @Column(name = "account_number")
    private Integer accountNumber;

	@NotNull
    @Column(name = "cliant_id")
    private Integer cliantId;

	@NotEmpty
    @Column(name = "branch_code")
    private String branchCode;

    @Column(name="insert_date", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date insertDate;

    @Column(name = "insert_user_id")
    private Integer insertUserId;

    @Column(name = "update_user_id")
    private Integer updateUserId;

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Integer getCliantId() {
        return cliantId;
    }
    public void setCliantId(Integer cliantId) {
        this.cliantId = cliantId;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public Integer getInsertUserId() {
        return insertUserId;
    }
    public void setInsertUserId(Integer insertUserId) {
        this.insertUserId = insertUserId;
    }

    public Integer getUpdateUserId() {
        return updateUserId;
    }
    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }
}