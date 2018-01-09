/*
 *Copyright Robert Bosch GmbH. All rights reserved, also regarding any disposal, exploration, reproduction, editing,
 *distribution, as well as in the event of applications for industrial property rights.
 */
package com.bosch.excel.crmservice.controller;


import com.bosch.excel.crmservice.service.AdvertisementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@RestController
public class AdvertisementController {

    @Autowired
    private AdvertisementService advertisementService;

    @RequestMapping(value = "/download" ,method = RequestMethod.GET)
    public boolean download(HttpServletRequest request, HttpServletResponse response){
        boolean flag = true;
        try {
            advertisementService.exportExcel(request,response);
        } catch (IOException e) {
            flag = false;
        }

        return flag;
    }

}
