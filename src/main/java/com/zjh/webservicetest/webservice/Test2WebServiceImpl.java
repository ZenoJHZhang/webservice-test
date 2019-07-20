package com.zjh.webservicetest.webservice;

import com.zjh.webservicetest.entity.Student;
import org.springframework.stereotype.Component;

import javax.jws.WebService;

/**
 * 类的说明
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/7/20 10:30
 */
@Component
@WebService(serviceName = "Tes2tWebService",
        targetNamespace = "http://webservice.webservicetest.zjh.com/",
        endpointInterface = "com.zjh.webservicetest.webservice.Test2WebService")
public class Test2WebServiceImpl implements Test2WebService {
    @Override
    public Student getStudent(Integer id,String name) {
        return new Student(id,name);
    }
}
