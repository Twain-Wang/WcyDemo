package com.jsyiyi.javacode.eventbus;

public class PostingEvent {
    public final String threadInfo;

    public PostingEvent(String threadInfo) {
        this.threadInfo = threadInfo;
    }
}
