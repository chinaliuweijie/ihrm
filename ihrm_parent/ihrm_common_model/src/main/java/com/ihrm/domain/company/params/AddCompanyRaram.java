package com.ihrm.domain.company.params;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

<<<<<<< HEAD
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
=======
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
>>>>>>> 5e970a3a01527fc8153197c8e9b84b0156375418
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
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
<<<<<<< HEAD
    @Size(min = 1,max = 10,message = "状态必须在1-10")
=======
   // @Size(min = 1,max = 10,message = "状态必须在1-10")
    @Min(value = 1, message = "状态必须在1-10")
    @Max(value = 10, message = "状态必须在1-10")
>>>>>>> 5e970a3a01527fc8153197c8e9b84b0156375418
    private byte state;
   // @Size(min = 0,message = "当前余额必须大于0")
    @Min(value = 0, message = "当前余额必须大于0")
    private double balance;
    @NotNull(message = "创建时间不能为空")
    @JsonFormat(timezone = "Asia/Shanghai", pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp createTime;

}
