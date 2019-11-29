package com.ihrm.domain.company.params;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;


import javax.validation.constraints.*;
import java.sql.Timestamp;

@Data
public class AddCompanyRaram {

    @NotBlank(message = "用户id不能为空")
    private String id;
    @NotBlank(message = "公司名称不能为空")
    private String name;
    @NotBlank(message = "企业登录账号ID不能为空")
    private String managerId;

    private String version;
    @JsonFormat(timezone = "Asia/Shanghai", pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp renewalDate;
    @JsonFormat(timezone = "Asia/Shanghai", pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp expirationDate;
    private String companyArea;
    private String companyAddress;
    private String businessLicenseId;
    private String legalRepresentative;
    private String companyPhone;
    private String mailbox;
    private String companySize;
    private String industry;
    private String remarks;
    private String auditState;

    @Min(value = 1, message = "状态必须在1-10")
    @Max(value = 10, message = "状态必须在1-10")
    private byte state;
    @Min(value = 0, message = "当前余额必须大于0")
    private double balance;
    @NotNull(message = "创建时间不能为空")
    @JsonFormat(timezone = "Asia/Shanghai", pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp createTime;

}
