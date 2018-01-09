/*
 *Copyright Robert Bosch GmbH. All rights reserved, also regarding any disposal, exploration, reproduction, editing,
 *distribution, as well as in the event of applications for industrial property rights.
 */
package com.bosch.excel.crmservice.service.impl;


import com.bosch.excel.crmservice.model.AdvertisementDto;
import com.bosch.excel.crmservice.service.AdvertisementService;
import org.apache.poi.ss.usermodel.Workbook;
import org.jeecgframework.poi.excel.ExcelExportUtil;
import org.jeecgframework.poi.excel.entity.ExportParams;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@Service
public class AdvertisementServiceImpl implements AdvertisementService {


    @Override
    public void exportExcel( HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setHeader("content-Type", "application/vnd.ms-excel");
        response.setHeader("Content-Disposition", "attachment;filename=user.xls");

        List ls = new ArrayList();
        AdvertisementDto ad1 = new AdvertisementDto();
        ad1.setId(2013L);
        ad1.setName("zhangsan");
        ad1.setAge(18);
        AdvertisementDto ad2 = new AdvertisementDto();
        ad2.setId(2014L);
        ad2.setName("lisi");
        ad2.setAge(25);
        ls.add(ad1);
        ls.add(ad2);

        Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams("用户信息","用户"), AdvertisementDto.class, ls);
        response.setCharacterEncoding("utf-8");
        workbook.write(response.getOutputStream());

    }
}
