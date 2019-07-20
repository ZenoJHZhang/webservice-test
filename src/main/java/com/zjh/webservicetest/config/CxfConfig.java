package com.zjh.webservicetest.config;

import com.zjh.webservicetest.webservice.Test2WebService;
import com.zjh.webservicetest.webservice.TestWebService;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * 类的说明
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/7/20 09:51
 */
@Configuration
public class CxfConfig {
    @Autowired
    private Bus bus;

    @Autowired
    private TestWebService testWebService;

    @Autowired
    private Test2WebService test2WebService;

    /** JAX-WS
     * 站点服务
     * **/
    @Bean
    public Endpoint testEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus,testWebService);
        endpoint.publish("/SOAP");
        return endpoint;
    }

    @Bean
    public Endpoint test2Endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus,test2WebService);
        endpoint.publish("/SOAP2");
        return endpoint;
    }
}


