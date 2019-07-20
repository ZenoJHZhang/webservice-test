package com.zjh.webservicetest.webservice;

import com.zjh.webservicetest.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebService;

/**
 * 写的是接口名，不是实现类
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/7/20 09:43
 */
@Component
@WebService(serviceName = "TestWebService",
        targetNamespace = "http://webservice.webservicetest.zjh.com/",
        endpointInterface = "com.zjh.webservicetest.webservice.TestWebService")
public class TestWebServiceImpl implements TestWebService {


    @Autowired
    private TestService testService;

    @Override
    public String getStudentName(Integer id) {
        return testService.getName(id);
    }

    @Override
    public Integer getStudentId(String name) {
        return 1;
    }
}
