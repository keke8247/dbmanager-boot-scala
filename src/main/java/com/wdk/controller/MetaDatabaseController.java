package com.wdk.controller;

import com.wdk.domain.MetaDatabase;
import com.wdk.service.MetaDatabaseService;
import com.wdk.util.ResponseMode;
import com.wdk.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author:wang_dk
 * @Date:2019/12/3 0003 21:35
 * @Version: v1.0
 **/
@RestController
@RequestMapping("/meta/database")
public class MetaDatabaseController {

    @Autowired
    private MetaDatabaseService metaDatabaseService;

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public ResponseMode save(@ModelAttribute MetaDatabase metaDatabase){
        metaDatabaseService.save(metaDatabase);
        return ResponseUtil.success();
    }

    @RequestMapping(value = "/query",method = RequestMethod.GET)
    public ResponseMode query(){
        return ResponseUtil.success(metaDatabaseService.query());
    }

    @RequestMapping(value = "",method = RequestMethod.GET)
    public String testHello(){
        return "NIMB";
    }
}
