package com.ihrm.company.dao;

import com.ihrm.domain.company.entity.CoCompanyEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CompanyDao extends JpaRepository<CoCompanyEntity,String>, JpaSpecificationExecutor<CoCompanyEntity> {

/*

    Page<CoCompanyEntity> findALL(Pageable pageable);


    Page<CoCompanyEntity> findByName(String name,Pageable pageable);
*/



    @Query(value = "from CoCompanyEntity where name = ?1")
    CoCompanyEntity findByName(String name);


    @Query(value = "update CoCompanyEntity set name=?1 where id = ?2")
    @Modifying
    void updateCompany(String name,String id);

    @Query(value = "select * from co_company where name like ?1",nativeQuery = true)
    List<CoCompanyEntity> findSqlAll(String name);

}
