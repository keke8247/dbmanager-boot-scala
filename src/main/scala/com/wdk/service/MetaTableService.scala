package com.wdk.service

import com.wdk.domain.MetaTable
import com.wdk.repository.MetaTableRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

/**
  * @Description:
  *              scala 使用@Autowired和java有差别如下 @Autowired作用在类名后面
  * @Author:wang_dk
  * @Date:2019 /12/3 0003 21:53
  * @Version: v1.0
  **/
@Service
class MetaTableService @Autowired()(metaTableRepository: MetaTableRepository){

    @Transactional
    def save(metaTable:MetaTable): Unit ={
        metaTableRepository.save(metaTable);
    }


    def query() ={
        metaTableRepository.findAll();
    }
}
