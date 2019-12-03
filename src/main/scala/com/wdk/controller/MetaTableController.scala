package com.wdk.controller

import com.wdk.domain.MetaTable
import com.wdk.util.{ResponseMode, ResponseUtil}
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation._
import com.wdk.service.MetaTableService

/**
  * @Description:
  * @Author:wang_dk
  * @Date:2019 /12/3 0003 21:59
  * @Version: v1.0
  **/
@RestController
@RequestMapping(Array("/meta/table"))
class MetaTableController @Autowired()(metaTableService: MetaTableService){

    @RequestMapping(value = Array("/save"),method = Array(RequestMethod.POST))
    @ResponseBody
    def save(@ModelAttribute metaTable:MetaTable)={
        metaTableService.save(metaTable);
        ResponseUtil.success();//直接调用java程序
    }

    @RequestMapping(value=Array("/query"),method = Array(RequestMethod.GET))
    def query()={
        ResponseUtil.success(metaTableService.query());
    }

}
