package com.example.designpattern.observer.service;

import com.example.designpattern.observer.LotteryResult;

import java.util.Date;

public class LotteryServiceImpl extends LotteryService{
    @Override
    protected LotteryResult doSomething(String uId) {
        LotteryResult lotteryResult = new LotteryResult();
        lotteryResult.setDateTime(new Date());
        lotteryResult.setUId(uId);
        lotteryResult.setMsg("执行了一些业务");
        return lotteryResult;
    }
}
