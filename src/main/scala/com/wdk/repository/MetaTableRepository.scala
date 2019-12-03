package com.wdk.repository

import com.wdk.domain.MetaTable
import org.springframework.data.repository.CrudRepository

/**
  * @Description:
  *              scala 的 trait 相当于java的interface
  * @Author:wang_dk
  * @Date:2019 /12/3 0003 21:52
  * @Version: v1.0
  **/
trait MetaTableRepository extends CrudRepository[MetaTable,Integer]{

}
