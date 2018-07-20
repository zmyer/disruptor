package com.lmax.disruptor;

// TODO: 2018/7/19 by zmyer
public interface TimeoutHandler {
    void onTimeout(long sequence) throws Exception;
}
