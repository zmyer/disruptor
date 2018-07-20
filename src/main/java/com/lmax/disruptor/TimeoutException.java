package com.lmax.disruptor;

// TODO: 2018/7/19 by zmyer
@SuppressWarnings("serial")
public final class TimeoutException extends Exception {
    public static final TimeoutException INSTANCE = new TimeoutException();

    private TimeoutException() {
        // Singleton
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
