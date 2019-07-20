package com.zjh.webservicetest.service;


import org.springframework.stereotype.Service;

/**
 * 类的说明
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/7/20 09:42
 */
@Service
public class TestServiceImpl implements TestService {

    @Override
    public String getName(Integer id) {
        return id+"ZJH";
    }
}
