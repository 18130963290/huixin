package com.baizhi.huixin;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HuixinApplicationTests {

    @Test
    public void contextLoads() {

        System.out.println("我的第一次拉取，我收到了，。。。。");
        System.out.println("我的第一次拉取，我收到了");
        System.out.println("我是来产生冲突的");

    }

}
