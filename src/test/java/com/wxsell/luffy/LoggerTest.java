package com.wxsell.luffy;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author:luffyhongliang
 * @Date:Created in :18:38 2017/12/5
 * @Description:
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {
      @Test
    public void LoggerTest(){
         log.debug("debug");
         log.info("info");
         log.error("error");
      }
}
