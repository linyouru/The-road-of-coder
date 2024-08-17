package com.example.designpattern.observer.service;

import com.example.designpattern.observer.EventManager;
import com.example.designpattern.observer.LotteryResult;
import com.example.designpattern.observer.eventListen.MessageEventListener;
import com.example.designpattern.observer.eventListen.MqEventListener;

public abstract class LotteryService {

    private EventManager eventManager;

    /**
     *
     */
    protected LotteryService() {
        eventManager = new EventManager(EventManager.EventType.MQ, EventManager.EventType.Message);
        eventManager.subscribe(EventManager.EventType.MQ, new MqEventListener());
        eventManager.subscribe(EventManager.EventType.Message, new MessageEventListener());
    }

    public LotteryResult doLottery(String uId) {
        LotteryResult lotteryResult = doSomething(uId);
        eventManager.notify(EventManager.EventType.MQ, lotteryResult);
        eventManager.notify(EventManager.EventType.Message, lotteryResult);
        return lotteryResult;
    }

    protected abstract LotteryResult doSomething(String uId);
}
