package com.discord.chat.bridge.botuikit;

import com.discord.serialization.IntEnum;
import kotlin.Metadata;

@Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m14357d2 = {"Lcom/discord/chat/bridge/botuikit/SelectOptionType;", "", "Lcom/discord/serialization/IntEnum;", "serialNumber", "", "(Ljava/lang/String;II)V", "getSerialNumber", "()I", "UNKNOWN", "STRING", "USER", "ROLE", "CHANNEL", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public enum SelectOptionType implements IntEnum {
    UNKNOWN(0),
    STRING(1),
    USER(2),
    ROLE(3),
    CHANNEL(4);
    
    private final int serialNumber;

    SelectOptionType(int i) {
        this.serialNumber = i;
    }

    @Override // com.discord.serialization.IntEnum
    public int getSerialNumber() {
        return this.serialNumber;
    }
}
