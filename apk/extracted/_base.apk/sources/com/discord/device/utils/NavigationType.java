package com.discord.device.utils;

import kotlin.Metadata;

@Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m14357d2 = {"Lcom/discord/device/utils/NavigationType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "BUTTON_THREE", "BUTTON_TWO", "GESTURE", "device_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
enum NavigationType {
    BUTTON_THREE(0),
    BUTTON_TWO(1),
    GESTURE(2);
    
    private final int value;

    NavigationType(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
