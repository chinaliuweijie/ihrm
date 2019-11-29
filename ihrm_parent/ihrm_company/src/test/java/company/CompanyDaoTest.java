package company;


import com.ihrm.company.CompanyApplication;
import com.ihrm.company.dao.CompanyDao;
import com.ihrm.domain.company.entity.CoCompanyEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;


@SpringBootTest(classes = CompanyApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class CompanyDaoTest {


    @Autowired
    private CompanyDao companyDao;

    @Test
    public void test(){
        CoCompanyEntity coCompanyEntity = companyDao.findById("1").get();
        System.out.println(coCompanyEntity);


        CoCompanyEntity companyEntity = companyDao.findByName("巍峨");
        System.out.println(companyEntity);

        updata();

        List<CoCompanyEntity> sqlAll = companyDao.findSqlAll("无敌%");
        for (CoCompanyEntity objects:sqlAll) {
            System.out.println(objects);
        }
    }




    void updata(){
        companyDao.updateCompany("无敌是多么的寂寞,无敌是多么的空虚","1");
    }


}
