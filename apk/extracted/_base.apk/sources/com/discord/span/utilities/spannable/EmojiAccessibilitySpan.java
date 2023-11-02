package com.discord.span.utilities.spannable;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m14357d2 = {"Lcom/discord/span/utilities/spannable/EmojiAccessibilitySpan;", "", ZeroconfModule.KEY_SERVICE_NAME, "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "span_utilities_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public final class EmojiAccessibilitySpan {
    private final String name;

    public EmojiAccessibilitySpan(String name) {
        C9612q.m13917h(name, "name");
        this.name = name;
    }

    public final String getName() {
        return this.name;
    }
}
