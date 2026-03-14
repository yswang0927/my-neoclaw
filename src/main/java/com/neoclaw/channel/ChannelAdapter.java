package com.neoclaw.channel;

/**
 * 通道适配器
 * 用于消息标准化、提取附件
 */
public interface ChannelAdapter {

    void normalizeMessage();

    void extractAttachment();

}
