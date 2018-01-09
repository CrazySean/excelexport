/*
 *Copyright Robert Bosch GmbH. All rights reserved, also regarding any disposal, exploration, reproduction, editing,
 *distribution, as well as in the event of applications for industrial property rights.
 */
package com.bosch.excel.crmservice.service;

import com.bosch.excel.crmservice.model.AdvertisementDto;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public interface AdvertisementService {

    void exportExcel(HttpServletRequest request, HttpServletResponse response) throws IOException;



}
