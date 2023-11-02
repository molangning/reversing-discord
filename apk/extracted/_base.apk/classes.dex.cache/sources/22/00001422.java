package com.discord.chat.presentation.message.view.voicemessages;

import kotlin.Metadata;

@Metadata(m14358d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m14357d2 = {"abs", "", "getAbs", "(B)B", "chat_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class SamplerKt {
    public static final byte getAbs(byte b) {
        if (b == Byte.MIN_VALUE) {
            return Byte.MAX_VALUE;
        }
        boolean z = false;
        if (-127 <= b && b < 1) {
            z = true;
        }
        return z ? (byte) (-b) : b;
    }
}