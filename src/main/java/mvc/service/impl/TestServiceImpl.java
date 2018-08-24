package mvc.service.impl;

import org.springframework.stereotype.Service;
import mvc.service.TestService;

/**
 * Created by martea on 2018/8/24.
 */
@Service
public class TestServiceImpl implements TestService{

    @Override
    public String testString(String var1) {
        return var1;
    }
}
