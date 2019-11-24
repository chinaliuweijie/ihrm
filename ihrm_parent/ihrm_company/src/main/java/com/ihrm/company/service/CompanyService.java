package com.ihrm.company.service;

import com.ihrm.common.error.BusinessException;
import com.ihrm.common.error.EmBusinessError;
import com.ihrm.common.utils.IdWorker;
import com.ihrm.company.dao.CompanyDao;
import com.ihrm.domain.company.CoCompanyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Optional;


@Service
public class CompanyService {
    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private IdWorker idWorker;

    public CoCompanyEntity add(CoCompanyEntity coCompanyEntity) {
        coCompanyEntity.setId(idWorker.nextId() + "");
        coCompanyEntity.setCreateTime(new Timestamp(System.currentTimeMillis()));
        coCompanyEntity.setState((byte) 1);
        coCompanyEntity.setAuditState("0"); //待审核
        coCompanyEntity.setBalance(1d);
        return companyDao.save(coCompanyEntity);
    }

    public CoCompanyEntity update(CoCompanyEntity company) {
        return companyDao.save(company);
    }

    public CoCompanyEntity findById(String id) {
        Optional<CoCompanyEntity> byId = companyDao.findById(id);
        return byId.orElse(null);
    }



    public void deleteById(String id) {
        companyDao.deleteById(id);
    }

    public List<CoCompanyEntity> findAll() {
        return companyDao.findAll();
    }


}
