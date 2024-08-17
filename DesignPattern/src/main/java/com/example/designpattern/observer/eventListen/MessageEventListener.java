package com.example.designpattern.observer.eventListen;

import com.example.designpattern.observer.LotteryResult;

/**
 * 处理事件具体的类
 */
public class MessageEventListener implements EventListener {

    @Override
    public void doEvent(LotteryResult massage) {
        // 模拟发邮件
        System.out.println("发送邮件: " + massage.getMsg());
    }
}
