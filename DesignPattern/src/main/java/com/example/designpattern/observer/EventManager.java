package com.example.designpattern.observer;

import com.example.designpattern.observer.eventListen.EventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 事件处理器
 *
 * 整个处理的实现上提供了三个主要⽅法；订阅( subscribe )、取消订阅( unsubscribe )、通知
 * ( notify )。这三个⽅法分别⽤于对监听时间的添加和使⽤。
 *
 * 另外因为事件有不同的类型，这⾥使⽤了枚举的⽅式进⾏处理，也⽅便让外部在规定下使⽤事件，
 * ⽽不⾄于乱传信息( EventType.MQ 、 EventType.Message )
 */
public class EventManager {

    private Map<EventType, List<EventListener>> listenerMap = new HashMap<>();

    public enum EventType {
        MQ, Message
    }

    /**
     * 构造函数
     * 通过EventType规定特定类型的事件
     * @param operations
     */
    public EventManager(EventType... operations) {
        for (EventType eventType : operations) {
            this.listenerMap.put(eventType, new ArrayList<>());
        }
    }

    /**
     * 订阅
     * @param eventType
     * @param listener
     */
    public void subscribe(EventType eventType, EventListener listener) {
        List<EventListener> eventListeners = listenerMap.get(eventType);
        eventListeners.add(listener);
    }

    /**
     * 取消订阅
     * @param eventType
     * @param listener
     */
    public void unsubscribe(EventType eventType, EventListener listener) {
        List<EventListener> eventListeners = listenerMap.get(eventType);
        eventListeners.remove(listener);
    }

    /**
     * 通知
     * @param eventType
     * @param lotteryResult
     */
    public void notify(EventType eventType, LotteryResult lotteryResult) {
        List<EventListener> eventListeners = listenerMap.get(eventType);
        for (EventListener eventListener : eventListeners) {
            eventListener.doEvent(lotteryResult);
        }
    }

}
