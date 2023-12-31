package com.discord.span.utilities.spannable;

import com.discord.span.utilities.common.BackgroundStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m14357d2 = {"Lcom/discord/span/utilities/spannable/BackgroundSpan;", "", "style", "Lcom/discord/span/utilities/common/BackgroundStyle;", "(Lcom/discord/span/utilities/common/BackgroundStyle;)V", "getStyle", "()Lcom/discord/span/utilities/common/BackgroundStyle;", "span_utilities_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public class BackgroundSpan {
    private final BackgroundStyle style;

    public BackgroundSpan(BackgroundStyle style) {
        C9612q.m13917h(style, "style");
        this.style = style;
    }

    public final BackgroundStyle getStyle() {
        return this.style;
    }
}
