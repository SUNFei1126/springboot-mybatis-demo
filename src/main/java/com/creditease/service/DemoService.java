package com.creditease.service;

import com.creditease.dao.CodeMapper;
import com.creditease.pojo.Code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description ${description}
 * Created by sunyufei on 2019/1/18.
 */
@Service(value = "demoService")
public class DemoService {
    @Autowired
    private CodeMapper codeDao;

    public Code findOneCode(int n){
        return codeDao.selectByPrimaryKey(n);
    }
}
