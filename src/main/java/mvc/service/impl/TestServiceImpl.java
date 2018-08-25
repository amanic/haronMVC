package mvc.service.impl;

import mvc.dal.dao.UserMapper;
import mvc.dal.obj.TestBeanObj;
import mvc.dal.obj.TestBeanObjLazy;
import mvc.dal.obj.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mvc.service.TestService;
import org.springframework.transaction.annotation.Transactional;

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

    @Override
    @Transactional
    public String testString4(String var1) {
        User user = new User();
        user.setName("测试事物");
        user.setSex(1);
        user.setSchool("事物测试");
        user.setOperatorName("事物");
        user.setRemark("测试");
        userMapper.insert(user);
        int i = 1/0;
        return "成功";
    }


}
