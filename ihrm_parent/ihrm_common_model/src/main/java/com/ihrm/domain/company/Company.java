package com.ihrm.domain.company;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 在实体类 model 模块是分模块包来划分的 例如company模块和system模块
 */
@Data  //  set get
@AllArgsConstructor  // 满参的构造
@NoArgsConstructor   // 无惨的构造
public class Company {

    private String id;
    private String name;


}
