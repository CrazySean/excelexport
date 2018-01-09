/*
 *Copyright Robert Bosch GmbH. All rights reserved, also regarding any disposal, exploration, reproduction, editing,
 *distribution, as well as in the event of applications for industrial property rights.
 */
package com.bosch.excel.crmservice.model;

import org.jeecgframework.poi.excel.annotation.Excel;
import org.jeecgframework.poi.excel.annotation.ExcelTarget;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "t_ad")
@ExcelTarget("advertisement")
public class AdvertisementDto {
    @Id
    @GeneratedValue
    @Excel(name = "编号", orderNum = "1", isImportField = "id")
    private Long id;

    @Excel(name = "姓名", orderNum = "2", isImportField = "name")
    private String name;

    @Excel(name = "年龄", orderNum = "3", isImportField = "age")
    private Integer age;

    public AdvertisementDto() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
