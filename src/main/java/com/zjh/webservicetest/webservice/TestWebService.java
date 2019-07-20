package com.zjh.webservicetest.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * 类的说明
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/7/20 09:43
 */
@WebService(targetNamespace = "http://webservice.webservicetest.zjh.com/")
public interface TestWebService {

    @WebMethod
    @WebResult(name = "name")
    String getStudentName(@WebParam(name = "id") Integer id);

    Integer getStudentId(@WebParam(name = "name") String name);

}
