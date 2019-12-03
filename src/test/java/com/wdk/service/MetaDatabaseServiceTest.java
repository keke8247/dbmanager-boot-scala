package com.wdk.service;

import com.wdk.domain.MetaDatabase;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description:
 * @Author:wang_dk
 * @Date:2019/12/3 0003 21:29
 * @Version: v1.0
 **/
@SpringBootTest
public class MetaDatabaseServiceTest {

    @Autowired
    private MetaDatabaseService metaDatabaseService;

    @Test
    public void testSave(){
        MetaDatabase metaDatabase = new MetaDatabase();
        metaDatabase.setName("hive_test");
        metaDatabase.setLocation("http://hadoop0000:8802/user/hive/warehouse/hive_test.db");
        metaDatabaseService.save(metaDatabase);
    }

    @Test
    public void testQuery(){
        Iterable<MetaDatabase> iterable = metaDatabaseService.query();

        iterable.forEach(metaDatabase -> {
            System.out.println(metaDatabase.getName());
        });
    }
}
