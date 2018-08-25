package mvc.service.impl;

import mvc.dal.dao.UserMapper;
import mvc.dal.obj.TestBeanObj;
import mvc.dal.obj.TestBeanObjLazy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mvc.service.TestService;

/**
 * Created by martea on 2018/8/24.
 */
@Service
public class TestServiceImpl implements TestService{

    @Autowired
    TestBeanObj beanObj;

    @Autowired
    TestBeanObjLazy objLazy;

    @Autowired
    UserMapper userMapper;

    @Override
    public String testString(String var1) {
        return var1;
    }

    @Override
    public String testString1(String var1) {
        return beanObj.getString();
    }

    @Override
    public String testString2(String var1) {
        return objLazy.getString();
    }

    @Override
    public String testString3(String var1) {
        return userMapper.selectByPrimaryKey(1).getName();
    }


}
