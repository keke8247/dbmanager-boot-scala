package com.wdk.service;

import com.wdk.domain.MetaDatabase;
import com.wdk.repository.MetaDatabaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description:
 * @Author:wang_dk
 * @Date:2019/12/3 0003 21:25
 * @Version: v1.0
 **/
@Service
public class MetaDatabaseService {

    @Autowired
    private MetaDatabaseRepository metaDatabaseRepository;

    @Transactional
    public void save(MetaDatabase metaDatabase){
        metaDatabaseRepository.save(metaDatabase);
    }

    public Iterable query(){
        return metaDatabaseRepository.findAll();
    }
}
