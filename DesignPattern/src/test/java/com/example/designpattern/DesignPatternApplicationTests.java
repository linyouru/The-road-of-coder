package com.example.designpattern;

import com.example.designpattern.observer.service.LotteryService;
import com.example.designpattern.observer.service.LotteryServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DesignPatternApplicationTests {

    @Test
    void test() {
        LotteryService lotteryService = new LotteryServiceImpl();
        lotteryService.doLottery("10001");
        System.out.println("主线业务");
    }

}
