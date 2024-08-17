package com.example.designpattern.observer.eventListen;

import com.example.designpattern.observer.LotteryResult;

/**
 * 事件监听
 */
public interface EventListener {

    void doEvent(LotteryResult massage);

}
