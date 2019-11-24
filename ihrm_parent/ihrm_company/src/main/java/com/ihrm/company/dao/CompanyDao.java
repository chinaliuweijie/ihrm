package com.ihrm.company.dao;

import com.ihrm.domain.company.CoCompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CompanyDao extends JpaRepository<CoCompanyEntity,String>, JpaSpecificationExecutor<CoCompanyEntity> {
}
