package com.example.designpattern.observer.eventListen;

import com.example.designpattern.observer.LotteryResult;

public class MqEventListener implements EventListener {
    @Override
    public void doEvent(LotteryResult massage) {
        // 模拟给mq发消息
        System.out.println("给mq发消息: " + massage.getMsg());
    }
}
