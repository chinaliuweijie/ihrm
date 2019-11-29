package com.ihrm.company.cotroller;

import com.ihrm.common.base.BaseController;
import com.ihrm.common.entity.Result;
import com.ihrm.common.entity.ResultCode;
import com.ihrm.common.error.BusinessException;
import com.ihrm.common.error.EmBusinessError;
import com.ihrm.company.service.CompanyService;
import com.ihrm.domain.company.entity.CoCompanyEntity;
import com.ihrm.domain.company.params.AddCompanyRaram;
import org.hibernate.validator.constraints.Length;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
@Validated
public class CompanyController extends BaseController {
    @Autowired
    private CompanyService companyService;

    /**
     * 添加企业
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result add(@Validated @RequestBody AddCompanyRaram company) throws Exception {
        CoCompanyEntity coCompanyEntity = new CoCompanyEntity();
        BeanUtils.copyProperties(company,coCompanyEntity);
        companyService.add(coCompanyEntity);
        return Result.SUCCESS();
    }

    /**
     * 根据id更新企业信息
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result update(@PathVariable(name = "id") String id, @Validated @RequestBody AddCompanyRaram company) throws Exception {
        CoCompanyEntity one = companyService.findById(id);
        if(one == null){
            throw new BusinessException(EmBusinessError.USER_NOT_EXIST);
        }
        one.setName(company.getName());
        one.setRemarks(company.getRemarks());
        one.setState(company.getState());
        one.setAuditState(company.getAuditState());
        companyService.update(one);
        return Result.SUCCESS();
    }

    /**
     * 根据id删除企业信息
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result delete(@PathVariable(name = "id") String id) throws Exception {
        companyService.deleteById(id);
        return Result.SUCCESS();
    }

    /**
     *     * 根据ID获取公司信息
     *    
     */

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result findById(@Length(min=1,max=5)	  @PathVariable(name = "id") String id) throws Exception {
        CoCompanyEntity company = companyService.findById(id);
        if(company == null){
            throw new BusinessException(EmBusinessError.USER_NOT_EXIST);
        }

        return new Result(ResultCode.SUCCESS,company);
    }

    /**
     *     * 获取企业列表
     *    
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public Result findAll() throws Exception {
        List<CoCompanyEntity> companyList = companyService.findAll();
        return new Result(ResultCode.SUCCESS,companyList);
    }
}