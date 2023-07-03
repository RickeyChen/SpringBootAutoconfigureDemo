package com.Rickey.SpringBootAutoconfigure;

import com.rickey.pojo.SimpleBean;
import com.rickey.service.SimpleBeanService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SimpleBeanTest {

    @Autowired
    private SimpleBean simpleBean;

    @Autowired
    private SimpleBeanService simpleBeanService;

    @Test
    public void test() {
        System.out.println(simpleBean.getId());
        System.out.println(simpleBean.getName());
    }

    @Test
    public void jjj(){
        System.out.println(simpleBeanService.toString());
    }

}
