package com.wdk.domain

import javax.persistence.{Entity, GeneratedValue, Id, Table}

import scala.beans.BeanProperty

/**
  * @Description:TODO
  * @Author:wang_dk
  * @Date:2019 /12/3 0003 21:45
  * @Version: v1.0
  **/
@Entity
@Table
class MetaTable {

    @Id
    @GeneratedValue
    @BeanProperty
    /**数据表ID*/
    var id : Integer = _;

    @BeanProperty
    /**数据库表类型  1内部表/2外部表 */
    var tableType : String = _;

    @BeanProperty
    /**表名称*/
    var name : String = _;

    @BeanProperty
    /**数据库ID*/
    var dbId : Integer = _;


    /**scala不需要getter setter 方法,默认会自动生成*/
}
