package mybatis;

import com.cubemall.search.CubemallSearchApplication;
import com.cubemall.search.dao.SpuInfoDao;
import com.cubemall.search.entity.SpuInfoEntity;
import com.cubemall.search.model.SpuInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = CubemallSearchApplication.class)
public class MyBatisTest {
    @Autowired
    private SpuInfoDao spuInfoDao;

    @Test
    public void testSpuInfoDao() {
        SpuInfoEntity entity = spuInfoDao.selectById(54687200);
        System.out.println(entity);
    }

    @Test
    public void testGetSpuById() {
        SpuInfo info = spuInfoDao.getSpuInfoById(54687200l);
        System.out.println(info);
    }
}
