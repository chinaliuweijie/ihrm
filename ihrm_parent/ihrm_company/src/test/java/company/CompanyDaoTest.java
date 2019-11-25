package company;


import com.ihrm.company.CompanyApplication;
import com.ihrm.company.dao.CompanyDao;
import com.ihrm.domain.company.entity.CoCompanyEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@SpringBootTest(classes = CompanyApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class CompanyDaoTest {


    @Autowired
    private CompanyDao companyDao;

    @Test
    public void test(){

        CoCompanyEntity coCompanyEntity = companyDao.findById("1").get();
        System.out.println(coCompanyEntity);
    }




}
