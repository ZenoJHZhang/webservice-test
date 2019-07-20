package com.zjh.webservicetest.webservice;

import com.zjh.webservicetest.entity.Student;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * 类的说明
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/7/20 10:30
 */
@WebService(targetNamespace = "http://webservice.webservicetest.zjh.com/")
public interface Test2WebService {
    @WebMethod
    @WebResult(name = "student")
    Student getStudent(@WebParam(name = "id") Integer id,@WebParam(name ="name") String name);
}
